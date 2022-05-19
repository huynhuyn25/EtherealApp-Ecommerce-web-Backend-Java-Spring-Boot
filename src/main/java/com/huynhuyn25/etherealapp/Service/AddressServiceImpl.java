package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.Address;
import com.huynhuyn25.etherealapp.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AddressServiceImpl implements IAddressService{
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address addAddress(Address address) {
        if(address!=null){
            return addressRepository.save(address);
        }
        return null;
    }

    @Override
    public Address updateAddress(Address address, int id) {
        if(address!=null){
            Address address1 = addressRepository.getById(id);
            if(address1!=null){
                address1.setCity(address.getCity());
                address1.setDistrict(address.getDistrict());
                address1.setWard(address.getWard());
                address1.setStrest(address.getStrest());
                address1.setBuilding(address.getBuilding());
                address1.setNumberHome(address.getNumberHome());
                return addressRepository.save(address1);
            }
        }
        return null;
    }

    @Override
    public boolean removeAddress(int id) {
        if(id>=1){
            Address address = addressRepository.getById(id);
            if(address!=null){
                addressRepository.delete(address);
                return true;
            }
        }

        return false;
    }

    @Override
    public ArrayList<Address> getAllAddress() {
        return (ArrayList<Address>) addressRepository.findAll();
    }

    @Override
    public Address getOneAddress(int id) {
        if(id>=1){
            Address address = addressRepository.findById(id).get();
            if(address!=null){
                return address;
            }
        }
        return null;

    }
}
