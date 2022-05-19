package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.*;
import com.huynhuyn25.etherealapp.Repository.CartRepository;
import com.huynhuyn25.etherealapp.Repository.ManufacturerRepository;
import com.huynhuyn25.etherealapp.Repository.ProductCartRepository;
import com.huynhuyn25.etherealapp.Repository.ProductRepository;

import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class CartServiceImpl implements ICartService{
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductCartRepository productCartRepository;

    @Override
    public Cart addCart(int idCart, int idProduct, int soLuong) {
        Cart cart = cartRepository.findById(idCart).get();
        if(cart!=null){
            List<ProductCart> list =  cart.getListProductCart();
            Product product = productRepository.findById(idProduct).get();
            for(ProductCart productCart:list){
                System.out.println(productCart.getProduct().getIdProduct());
                System.out.println(idProduct);
                if(productCart.getProduct().getIdProduct()==idProduct){

                    if(productCart.getSoluong()+soLuong<=product.getSoluongCon()){
                        productCart.setSoluong(productCart.getSoluong()+soLuong);
                        double tong =0;
                        for(ProductCart productCart1 :list){
                            tong+=productCart1.getSoluong()*productCart1.getProduct().getPrice();
                            System.out.println(tong);
                        }
                        cart.setTotal(tong);
                        return cartRepository.save(cart);
                    }
                    return null;

                }
            }

            if(product.getSoluongCon()<soLuong) return null;
            ProductCart productCart = new ProductCart(product,soLuong);
            list.add(productCart);
            cart.setListProductCart(list);
            double tong =0;
            for(ProductCart productCart1 :list){
                tong+=productCart1.getSoluong()*productCart1.getProduct().getPrice();
            }
            cart.setTotal(tong);
            return cartRepository.save(cart);
        }
        return null;
    }

    @Override
    public Cart updateCart(int idCart,int idProductCard,int soLuong) {
        Cart cart = cartRepository.findById(idCart).get();
        if(cart!=null){
            List<ProductCart> list = cart.getListProductCart();
            for(ProductCart product:list){
                if (product.getIdProductCart()==idProductCard){
                    if(product.getProduct().getSoluongCon()<soLuong) return null;
                    product.setSoluong(soLuong);
                    double tong =0;
                    for(ProductCart productCart1 :list){
                        tong+=productCart1.getSoluong()*productCart1.getProduct().getPrice();
                    }
                    cart.setTotal(tong);
                    return cartRepository.save(cart);
                }
            }

        }
        return null;
    }

    @Override
    public boolean removeCart(int idProductCart) {
        if(idProductCart>=1){
            ProductCart productCart = productCartRepository.getById(idProductCart);
            if(productCart!=null){
                productCart.setProduct(null);
                productCartRepository.save(productCart);
                productCartRepository.delete(productCart);
                return true;
            }
        }

        return false;
    }

    @Override
    public Cart getCart(int idCart) {
        if(idCart>=1){
            Cart cart = cartRepository.findById(idCart).get();
            if(cart!=null){
                return cart;
            }
        }
        return null;

    }
}
