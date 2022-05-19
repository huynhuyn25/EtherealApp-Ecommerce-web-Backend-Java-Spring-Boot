package com.huynhuyn25.etherealapp.Controller;

import com.huynhuyn25.etherealapp.Model.AvaPhoto;
import com.huynhuyn25.etherealapp.Model.SliderPhoto;
import com.huynhuyn25.etherealapp.Service.IAvaPhotoService;
import com.huynhuyn25.etherealapp.Service.ISliderPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
@RequestMapping("/slider_photo")
public class SliderPhotoController {

    @Autowired
    private ISliderPhotoService iSliderPhotoService;
    @GetMapping("/getAll")
    public ArrayList<SliderPhoto> getAllAvaPhoto(){
        return iSliderPhotoService.getAllSliderPhoto();
    }
}
