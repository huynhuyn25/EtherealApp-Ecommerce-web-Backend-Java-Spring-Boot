package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.Product;

import java.util.ArrayList;


public interface IProductService {
    public Product addProduct(Product product);
    public Product updateProduct(Product product,int id);
    public boolean removeProduct(int id);
    public ArrayList<Product> getAllProduct();
    public Product getOneProduct(int id);
}
