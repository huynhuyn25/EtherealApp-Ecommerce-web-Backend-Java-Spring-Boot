package com.huynhuyn25.etherealapp.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customer_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrder;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_user")
    private User user;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_product_order")
    private List<ProductOrder> listProductOrder= new ArrayList<>();

    private String status;
    private double total;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_order_infor")
    private OrderInfor orderInfor;

    public Order() {
    }

    public Order(int idOrder, User user, List<ProductOrder> listProductOrder, String status, double total, OrderInfor orderInfor) {
        this.idOrder = idOrder;
        this.user = user;
        this.listProductOrder = listProductOrder;
        this.status = status;
        this.total = total;
        this.orderInfor = orderInfor;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<ProductOrder> getListProductOrder() {
        return listProductOrder;
    }

    public void setListProductOrder(List<ProductOrder> listProductOrder) {
        this.listProductOrder = listProductOrder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public OrderInfor getOrderInfor() {
        return orderInfor;
    }

    public void setOrderInfor(OrderInfor orderInfor) {
        this.orderInfor = orderInfor;
    }
}
