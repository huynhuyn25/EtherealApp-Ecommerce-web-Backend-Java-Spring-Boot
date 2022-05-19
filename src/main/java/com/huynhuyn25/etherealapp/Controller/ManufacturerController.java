package com.huynhuyn25.etherealapp.Controller;

import com.huynhuyn25.etherealapp.Model.Manufacturer;
import com.huynhuyn25.etherealapp.Service.IManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/manufacturer")
public class ManufacturerController {
    @Autowired
    private IManufacturerService iManufacturerService;

    @PostMapping("/add")
    public Manufacturer addManufacturer(@RequestBody Manufacturer manufacturer){
        return iManufacturerService.addManufacturer(manufacturer);

    }

    @PutMapping("/update")
    public Manufacturer updateManufacturer(@RequestParam int id,@RequestBody Manufacturer manufacturer){
        return iManufacturerService.updateManufacturer(manufacturer,id);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteManufacturer(@PathVariable int id){
        return iManufacturerService.removeManufacturer(id);
    }

    @GetMapping("/getAll")
    public ArrayList<Manufacturer> getAllManufacturer(){
        return iManufacturerService.getAllManufacturer();
    }

    @GetMapping("/get")
    public Manufacturer getOneManufacturer(@RequestParam int id){
        return iManufacturerService.getOneManufacturer(id);
    }
}

