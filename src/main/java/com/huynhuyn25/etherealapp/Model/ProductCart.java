package com.huynhuyn25.etherealapp.Model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "product_cart")
public class ProductCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProductCart;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idProduct")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Product Product;

    private int soluong;

    public ProductCart(Product product, int soluong) {
        Product = product;
        this.soluong = soluong;
    }


    public ProductCart() {

    }

    public ProductCart(int idProductCart, Product product, int soluong) {
        this.idProductCart = idProductCart;
        Product = product;
        this.soluong = soluong;
    }

    public int getIdProductCart() {
        return idProductCart;
    }

    public void setIdProductCart(int idProductCart) {
        this.idProductCart = idProductCart;
    }

    public Product getProduct() {
        return Product;
    }

    public void setProduct(Product product) {
        Product = product;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
