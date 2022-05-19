package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.AvaPhoto;
import com.huynhuyn25.etherealapp.Model.SliderPhoto;
import com.huynhuyn25.etherealapp.Repository.AvaPhotoRepository;
import com.huynhuyn25.etherealapp.Repository.SliderPhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SliderPhotoServiceImpl implements ISliderPhotoService{
    @Autowired
    private SliderPhotoRepository sliderPhotoRepository;
    @Override
    public ArrayList<SliderPhoto> getAllSliderPhoto() {
        return (ArrayList<SliderPhoto>) sliderPhotoRepository.findAll();
    }
}
