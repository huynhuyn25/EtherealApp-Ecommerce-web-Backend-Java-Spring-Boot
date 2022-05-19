package com.huynhuyn25.etherealapp.Controller;

import com.huynhuyn25.etherealapp.Model.AvaPhoto;
import com.huynhuyn25.etherealapp.Model.Photo;
import com.huynhuyn25.etherealapp.Service.IAvaPhotoService;
import com.huynhuyn25.etherealapp.Service.IPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/ava_photo")
public class AvaPhotoController {
    @Autowired
    private IAvaPhotoService iAvaPhotoService;

    @PostMapping("/add")
    public AvaPhoto addAvaPhoto(@RequestBody AvaPhoto avaPhoto){
        return iAvaPhotoService.addAvaPhoto(avaPhoto);
    }

    @PutMapping("/update")
    public Photo updateAvaPhoto(@RequestParam int id,@RequestBody AvaPhoto photo){
        return iAvaPhotoService.updateAvaPhoto(photo,id);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteAvaPhoto(@PathVariable int id){
        return iAvaPhotoService.removeAvaPhoto(id);
    }

    @GetMapping("/getAll")
    public ArrayList<AvaPhoto> getAllAvaPhoto(){
        return iAvaPhotoService.getAllAvaPhoto();
    }

    @GetMapping("/get")
    public AvaPhoto getOneAvaPhoto(@RequestParam int id){
        return iAvaPhotoService.getOneAvaPhoto(id);
    }
}
