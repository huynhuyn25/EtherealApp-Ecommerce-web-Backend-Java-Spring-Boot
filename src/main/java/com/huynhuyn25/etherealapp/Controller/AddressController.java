package com.huynhuyn25.etherealapp.Controller;

import com.huynhuyn25.etherealapp.Model.Address;
import com.huynhuyn25.etherealapp.Service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private IAddressService iAddressService;

    @PostMapping("/add")
    public Address addAddress(@RequestBody Address address){
        return iAddressService.addAddress(address);
    }

    @PutMapping("/update")
    public Address updateAddress(@RequestParam int id,@RequestBody Address address){
        return iAddressService.updateAddress(address,id);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteAddress(@PathVariable int id){
        return iAddressService.removeAddress(id);
    }

    @GetMapping("/getAll")
    public ArrayList<Address> getAllAddress(){
        return iAddressService.getAllAddress();
    }

    @GetMapping("/get")
    public Address getOneAddress(@RequestParam int id){
        return iAddressService.getOneAddress(id);
    }
}