package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.Address;
import com.huynhuyn25.etherealapp.Model.Manufacturer;
import com.huynhuyn25.etherealapp.Repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ManufacturerServiceImpl implements IManufacturerService{
    @Autowired
    private ManufacturerRepository manufacturerRepository;

    @Override
    public Manufacturer addManufacturer(Manufacturer manufacturer) {
        if(manufacturer!=null){
            return manufacturerRepository.save(manufacturer);
        }
        return null;
    }

    @Override
    public Manufacturer updateManufacturer(Manufacturer manufacturer, int id) {
        if(manufacturer!=null){
            Manufacturer manufacturer1 = manufacturerRepository.getById(id);
            if(manufacturer1!=null){
                manufacturer1.setTenncc(manufacturer.getTenncc());
                manufacturer1.setEmail(manufacturer.getEmail());
                manufacturer1.setSdt(manufacturer.getSdt());
                manufacturer1.setTenctyql(manufacturer.getTenctyql());
                manufacturer1.setAddress(new Address(manufacturer1.getAddress().getIdAdress(),manufacturer.getAddress().getCity(),manufacturer.getAddress().getDistrict(),manufacturer.getAddress().getWard(),
                        manufacturer.getAddress().getStrest(),manufacturer.getAddress().getBuilding(),manufacturer.getAddress().getNumberHome()));
                return manufacturerRepository.save(manufacturer1);
            }
        }
        return null;
    }

    @Override
    public boolean removeManufacturer(int id) {
        if(id>=1){
            Manufacturer manufacturer = manufacturerRepository.getById(id);
            if(manufacturer!=null){
                manufacturerRepository.delete(manufacturer);
                return true;
            }
        }

        return false;
    }

    @Override
    public ArrayList<Manufacturer> getAllManufacturer() {
        return (ArrayList<Manufacturer>) manufacturerRepository.findAll();
    }

    @Override
    public Manufacturer getOneManufacturer(int id) {
        if(id>=1){
            Manufacturer manufacturer = manufacturerRepository.findById(id).get();
            if(manufacturer!=null){
                return manufacturer;
            }
        }
        return  null;
    }
}