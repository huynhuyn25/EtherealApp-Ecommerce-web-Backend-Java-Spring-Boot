package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.OrderInfor;
import com.huynhuyn25.etherealapp.Repository.OrderInforRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderInforServiceImpl implements IOrderInforService{
    @Autowired
    private OrderInforRepository orderInforRepository;

    @Override
    public OrderInfor addOrderInfor(OrderInfor orderInfor) {
        if(orderInfor!=null){
            return orderInforRepository.save(orderInfor);
        }
        return null;
    }

    @Override
    public OrderInfor updateOrderInfor(OrderInfor orderInfor, int id) {
        if(orderInfor!=null){
            OrderInfor orderInfor1 = orderInforRepository.getById(id);
            if(orderInfor1!=null){
                orderInfor1.setAddress(orderInfor.getAddress());
                orderInfor1.setTenNguoiNhan(orderInfor.getTenNguoiNhan());
                orderInfor1.setSdt(orderInfor.getSdt());
                return orderInforRepository.save(orderInfor);
            }
        }
        return null;
    }

    @Override
    public boolean removeOrderInfor(int id) {
        if(id>=1){
            OrderInfor orderInfor = orderInforRepository.getById(id);
            if(orderInfor!=null){
                orderInforRepository.delete(orderInfor);
                return true;
            }
        }

        return false;
    }

    @Override
    public ArrayList<OrderInfor> getAllOrderInfor() {
        return (ArrayList<OrderInfor>) orderInforRepository.findAll();
    }

    @Override
    public OrderInfor getOneOrderInfor(int id) {
        if(id>=1){
            OrderInfor orderInfor = orderInforRepository.findById(id).get();
            if(orderInfor!=null){
                return orderInfor;
            }
        }
        return  null;
    }
}
