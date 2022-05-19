package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.Address;

import java.util.ArrayList;

public interface IAddressService {
    public Address addAddress(Address address);
    public Address updateAddress(Address address,int id);
    public boolean removeAddress(int id);
    public ArrayList<Address> getAllAddress();
    public Address getOneAddress(int id);
}
