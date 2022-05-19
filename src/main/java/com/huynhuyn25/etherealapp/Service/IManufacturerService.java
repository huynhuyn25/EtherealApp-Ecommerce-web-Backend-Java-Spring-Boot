package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.Manufacturer;

import java.util.ArrayList;

public interface IManufacturerService {
    public Manufacturer addManufacturer(Manufacturer manufacturer);
    public Manufacturer updateManufacturer(Manufacturer manufacturer,int id);
    public boolean removeManufacturer(int id);
    public ArrayList<Manufacturer> getAllManufacturer();
    public Manufacturer getOneManufacturer(int id);
}
