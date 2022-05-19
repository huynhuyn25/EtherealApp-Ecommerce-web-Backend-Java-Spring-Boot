package com.huynhuyn25.etherealapp.Controller;

import com.huynhuyn25.etherealapp.Model.Address;
import com.huynhuyn25.etherealapp.Model.Category;
import com.huynhuyn25.etherealapp.Service.IAddressService;
import com.huynhuyn25.etherealapp.Service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;

    @PostMapping("/add")
    public Category addCategory(@RequestBody Category address){
        return iCategoryService.addCategory(address);
    }

    @PutMapping("/update")
    public Category updateCategory(@RequestParam int id,@RequestBody Category address){
        return iCategoryService.updateCategory(address,id);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteCategory(@PathVariable int id){
        return iCategoryService.removeCategory(id);
    }

    @GetMapping("/getAll")
    public ArrayList<Category> getAllCategory(){
        return iCategoryService.getAllCategory();
    }

    @GetMapping("/get")
    public Category getOneCategory(@RequestParam int id){
        return iCategoryService.getOneCategory(id);
    }
}
