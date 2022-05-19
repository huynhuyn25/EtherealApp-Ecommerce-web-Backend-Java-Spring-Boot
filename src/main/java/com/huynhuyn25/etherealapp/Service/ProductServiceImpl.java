package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.Product;
import com.huynhuyn25.etherealapp.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductServiceImpl implements IProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        if(product!=null){
            return productRepository.save(product);
        }
        return null;
    }

    @Override
    public Product updateProduct(Product product, int id) {
        if(product!=null){
            Product product1 = productRepository.getById(id);
            if(product1!=null){
                product1.setManufacturer(product.getManufacturer());
                product1.setCategory(product.getCategory());
                product1.setListProductPhoto(product.getListProductPhoto());
                product1.setPrice(product.getPrice());
                product1.setName(product.getName());
                product1.setSoluongCon(product.getSoluongCon());
                return productRepository.save(product1);
            }
        }
        return null;
    }

    @Override
    public boolean removeProduct(int id) {
        if(id>=1){
            Product product = productRepository.getById(id);
            if(product!=null){
                productRepository.delete(product);
                return true;
            }
        }

        return false;
    }

    @Override
    public ArrayList<Product> getAllProduct() {
        return (ArrayList<Product>) productRepository.findAll();
    }

    @Override
    public Product getOneProduct(int id) {
        if(id>=1){
            Product product = productRepository.findById(id).get();
            if(product!=null){
                return product;
            }
        }
        return  null;
    }
}
