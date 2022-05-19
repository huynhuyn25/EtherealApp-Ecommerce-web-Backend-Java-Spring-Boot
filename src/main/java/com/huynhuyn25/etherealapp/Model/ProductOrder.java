package com.huynhuyn25.etherealapp.Model;

import javax.persistence.*;

@Entity
@Table(name = "product_order")
public class ProductOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProductOrder;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idProduct")
    private Product product;
    private int soLuong;

    public ProductOrder() {
    }

    public ProductOrder(int idProductOrder, Product product, int soLuong) {
        this.idProductOrder = idProductOrder;
        this.product = product;
        this.soLuong = soLuong;

    }

    public int getIdProductOrder() {
        return idProductOrder;
    }

    public void setIdProductOrder(int idProductOrder) {
        this.idProductOrder = idProductOrder;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

}
