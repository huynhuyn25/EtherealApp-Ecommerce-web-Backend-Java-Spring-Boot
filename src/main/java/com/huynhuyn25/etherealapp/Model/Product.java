package com.huynhuyn25.etherealapp.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;
    private String name;
    private double price;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_manufaturer")
    private Manufacturer manufacturer;
    private int soluongCon;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_category")
    private Category category;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_product_photo")
    private List<ProductPhoto> listProductPhoto= new ArrayList<>();

    public Product(int idProduct, String name, double price, Manufacturer manufacturer, int soluongCon, Category category, ArrayList<ProductPhoto> listProductPhoto) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.soluongCon = soluongCon;
        this.category = category;
        this.listProductPhoto = listProductPhoto;
    }

    public Product(String name, double price, Manufacturer manufacturer, int soluongCon, Category category, ArrayList<ProductPhoto> listProductPhoto) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.soluongCon = soluongCon;
        this.category = category;
        this.listProductPhoto = listProductPhoto;
    }

    public Product() {
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSoluongCon() {
        return soluongCon;
    }

    public void setSoluongCon(int soluongCon) {
        this.soluongCon = soluongCon;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<ProductPhoto> getListProductPhoto() {
        return  listProductPhoto;
    }

    public void setListProductPhoto(List<ProductPhoto> listProductPhoto) {
        this.listProductPhoto = listProductPhoto;
    }
}
