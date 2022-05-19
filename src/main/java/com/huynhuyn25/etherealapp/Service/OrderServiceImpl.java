package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.*;
import com.huynhuyn25.etherealapp.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService{
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderInforRepository orderInforRepository;
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ProductCartRepository productCartRepository;

    @Override
    public Order addOrder(int idUser, int idOrderInfor,String status, double tongTien) {
        if(idUser>0&&idOrderInfor>0){
            Order order = new Order();
            order.setUser(userRepository.findById(idUser).get());
            order.setOrderInfor(orderInforRepository.findById(idOrderInfor).get());
            order.setStatus(status);
            order.setTotal(tongTien);
            return orderRepository.save(order);
        }
        return null;
    }

    @Override
    public Order updateOrder(int idOrder, String status) {
        if(idOrder>0){
            Order order1 = orderRepository.findById(idOrder).get();
            if(order1!=null){
                order1.setStatus(status);
                return orderRepository.save(order1);
            }
        }
        return null;
    }

    @Override
    public Order updateProductOrder(int idOrder, int idProduct,int soLuong) {
        if(idProduct>0&&idOrder>0){
            Order order1 = orderRepository.findById(idOrder).get();
            if(order1!=null){
                ProductOrder productOrder = new ProductOrder();

                Product product = productRepository.findById(idProduct).get();
                productOrder.setProduct(product);
                productOrder.setSoLuong(soLuong);
                List<ProductOrder> list = order1.getListProductOrder();
                list.add(productOrder);
                order1.setListProductOrder(list);
                order1.setTotal(order1.getTotal()+product.getPrice()*soLuong);
                product.setSoluongCon(product.getSoluongCon()-soLuong);
                productRepository.save(product);
                User user = order1.getUser();
                Cart cart = user.getCart();
                List<ProductCart> listProductCart = user.getCart().getListProductCart();
                for(ProductCart productCart :listProductCart){
                    System.out.println(productCart.getProduct().getIdProduct());
                    if(productCart.getProduct().getIdProduct()==idProduct){
                        System.out.println(productCart.getProduct().getIdProduct());
                        System.out.println(productCart.getIdProductCart());
                        listProductCart.remove(productCart);
                        cart.setListProductCart(listProductCart);
                        cartRepository.save(cart);
                        productCartRepository.delete(productCart);
                        break;
                    }
                }
                return orderRepository.save(order1);
            }
        }
        return null;
    }



    @Override
    public ArrayList<Order> getOrderByIDUser(int id){
        if(id>0){
            ArrayList<Order> orders = orderRepository.findOrderByIDUser(id);
            if(orders.size()>0){
                return orders;
            }
        }
        return  null;
    }
    @Override
    public ArrayList<Order> getAllOrder() {
        return (ArrayList<Order>) orderRepository.findAll();
    }
}
