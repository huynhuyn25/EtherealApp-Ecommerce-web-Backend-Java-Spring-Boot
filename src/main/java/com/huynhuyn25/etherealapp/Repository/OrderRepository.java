package com.huynhuyn25.etherealapp.Repository;

import com.huynhuyn25.etherealapp.Model.Address;
import com.huynhuyn25.etherealapp.Model.Order;
import com.huynhuyn25.etherealapp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface OrderRepository  extends JpaRepository<Order,Integer> {
    @Query("SELECT customer_order FROM Order customer_order WHERE customer_order.user.idUser=?1 ")
    public ArrayList<Order> findOrderByIDUser(int idUser);
}
