package com.huynhuyn25.etherealapp.Model;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCart;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_cart")
    private List<ProductCart> listProductCart= new ArrayList<>();
    private double Total;

    public Cart() {
    }

    public Cart(int idCart, @Nullable  ArrayList<ProductCart> listProductCart, double total) {
        this.idCart = idCart;
        this.listProductCart = listProductCart;
        Total = total;
    }

    public int getIdCart() {
        return idCart;
    }

    public void setIdCart(int idCart) {
        this.idCart = idCart;
    }

    public List<ProductCart> getListProductCart() {
        return listProductCart;
    }

    public void setListProductCart(List<ProductCart> listProductCart) {
        this.listProductCart = listProductCart;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }
}
