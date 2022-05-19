package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.AvaPhoto;
import com.huynhuyn25.etherealapp.Model.CategoryPhoto;
import com.huynhuyn25.etherealapp.Repository.AvaPhotoRepository;
import com.huynhuyn25.etherealapp.Repository.CategoryPhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CategoryPhotoServiceImpl implements ICategoryPhotoService{
    @Autowired
    private CategoryPhotoRepository  categoryPhotoRepository;

    @Override
    public CategoryPhoto addCategoryPhoto(CategoryPhoto  categoryPhoto) {
        if( categoryPhoto!=null){
            return  categoryPhotoRepository.save( categoryPhoto);
        }
        return null;
    }

    @Override
    public CategoryPhoto updateCategoryPhoto(CategoryPhoto  categoryPhoto, int id) {
        if( categoryPhoto!=null){
            CategoryPhoto  categoryPhoto1 =  categoryPhotoRepository.getById(id);
            if( categoryPhoto1!=null){
                categoryPhoto1.setNamePhoto( categoryPhoto.getNamePhoto());
                categoryPhoto1.setUrl( categoryPhoto.getUrl());
                return  categoryPhotoRepository.save( categoryPhoto1);
            }
        }
        return null;
    }

    @Override
    public boolean removeCategoryPhoto(int id) {
        if(id>=1){
            CategoryPhoto  categoryPhoto =  categoryPhotoRepository.getById(id);
            if( categoryPhoto!=null){
                categoryPhotoRepository.delete( categoryPhoto);
                return true;
            }
        }

        return false;
    }

    @Override
    public ArrayList<CategoryPhoto> getAllCategoryPhoto() {
        return (ArrayList<CategoryPhoto>)  categoryPhotoRepository.findAll();
    }

    @Override
    public CategoryPhoto getOneCategoryPhoto(int id) {
        if(id>=1){
            CategoryPhoto  categoryPhoto =  categoryPhotoRepository.findById(id).get();
            if( categoryPhoto!=null){
                return categoryPhoto;
            }
        }
        return null;

    }
}
