package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.OrderInfor;

import java.util.ArrayList;

public interface IOrderInforService {
    public OrderInfor addOrderInfor(OrderInfor manufacturer);
    public OrderInfor updateOrderInfor(OrderInfor manufacturer,int id);
    public boolean removeOrderInfor(int id);
    public ArrayList<OrderInfor> getAllOrderInfor();
    public OrderInfor getOneOrderInfor(int id);
}
