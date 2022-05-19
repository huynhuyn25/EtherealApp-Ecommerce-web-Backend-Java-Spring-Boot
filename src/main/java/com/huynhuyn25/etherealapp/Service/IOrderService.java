package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.Order;
import com.huynhuyn25.etherealapp.Model.Product;
import com.huynhuyn25.etherealapp.Model.User;

import java.util.ArrayList;

public interface IOrderService {
    public Order addOrder(int idUser, int idOrderInfor,String status, double tongTien );
    public Order updateOrder(int idOrder, String status);
    public Order updateProductOrder(int idOrder, int idProduct,int soLuong);
    public ArrayList<Order> getOrderByIDUser(int id);
    public ArrayList<Order> getAllOrder();
}
