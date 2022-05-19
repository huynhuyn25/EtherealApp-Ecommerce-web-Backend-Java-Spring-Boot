package com.huynhuyn25.etherealapp.Controller;

import com.huynhuyn25.etherealapp.Model.Product;
import com.huynhuyn25.etherealapp.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return iProductService.addProduct(product);

    }

    @PutMapping("/update")
    public Product updateProduct(@RequestParam int id,@RequestBody Product product){
        return iProductService.updateProduct(product,id);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteProduct(@PathVariable int id){
        return iProductService.removeProduct(id);
    }

    @GetMapping("/getAll")
    public ArrayList<Product> getAllProduct(){
        return iProductService.getAllProduct();
    }

    @GetMapping("/get")
    public Product getOneProduct(@RequestParam int id){
        return iProductService.getOneProduct(id);
    }
}
