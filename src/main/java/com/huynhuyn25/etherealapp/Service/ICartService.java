package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.Cart;

public interface ICartService {
    public Cart addCart(int idCart, int idProduct, int soLuong);
    public Cart updateCart(int idCart, int idProduct, int soLuong);
    public boolean removeCart (int idProductCart);
    public Cart getCart (int idCart);
}
