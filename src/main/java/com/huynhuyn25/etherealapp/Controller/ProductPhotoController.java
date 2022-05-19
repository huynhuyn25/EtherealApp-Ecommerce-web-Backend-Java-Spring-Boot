package com.huynhuyn25.etherealapp.Controller;

import com.huynhuyn25.etherealapp.Model.AvaPhoto;
import com.huynhuyn25.etherealapp.Model.Photo;
import com.huynhuyn25.etherealapp.Model.ProductPhoto;
import com.huynhuyn25.etherealapp.Service.IAvaPhotoService;
import com.huynhuyn25.etherealapp.Service.IProductPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
@RequestMapping("/product_photo")
public class ProductPhotoController {
    @Autowired
    private IProductPhotoService iProductPhotoService;

    @PostMapping("/add")
    public ProductPhoto addProductPhoto(@RequestBody ProductPhoto avaPhoto){
        return iProductPhotoService.addProductPhoto(avaPhoto);
    }

    @PutMapping("/update")
    public Photo updateProductPhoto(@RequestParam int id, @RequestBody ProductPhoto photo){
        return iProductPhotoService.updateProductPhoto(photo,id);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteProductPhoto(@PathVariable int id){
        return iProductPhotoService.removeProductPhoto(id);
    }

    @GetMapping("/getAll")
    public ArrayList<ProductPhoto> getAllAProductPhoto(){
        return iProductPhotoService.getAllProductPhoto();
    }

    @GetMapping("/get")
    public ProductPhoto getOneProductPhoto(@RequestParam int id){
        return iProductPhotoService.getOneProductPhoto(id);
    }
}
