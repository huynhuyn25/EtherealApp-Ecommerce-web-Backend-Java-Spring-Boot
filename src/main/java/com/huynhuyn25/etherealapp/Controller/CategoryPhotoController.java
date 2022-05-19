package com.huynhuyn25.etherealapp.Controller;

import com.huynhuyn25.etherealapp.Model.AvaPhoto;
import com.huynhuyn25.etherealapp.Model.CategoryPhoto;
import com.huynhuyn25.etherealapp.Model.Photo;
import com.huynhuyn25.etherealapp.Service.IAvaPhotoService;
import com.huynhuyn25.etherealapp.Service.ICategoryPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/category_photo")
public class CategoryPhotoController {
    @Autowired
    private ICategoryPhotoService iCategoryPhotoService;

    @PostMapping("/add")
    public CategoryPhoto addCategoryPhoto(@RequestBody CategoryPhoto categoryPhoto){
        return iCategoryPhotoService.addCategoryPhoto(categoryPhoto);
    }

    @PutMapping("/update")
    public CategoryPhoto updateCategoryPhoto(@RequestParam int id, @RequestBody CategoryPhoto categoryphoto){
        return iCategoryPhotoService.updateCategoryPhoto(categoryphoto,id);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteCategoryPhoto(@PathVariable int id){
        return iCategoryPhotoService.removeCategoryPhoto(id);
    }

    @GetMapping("/getAll")
    public ArrayList<CategoryPhoto> getAllCategoryPhoto(){
        return iCategoryPhotoService.getAllCategoryPhoto();
    }

    @GetMapping("/get")
    public CategoryPhoto getOneCategoryPhoto(@RequestParam int id){
        return iCategoryPhotoService.getOneCategoryPhoto(id);
    }
}
