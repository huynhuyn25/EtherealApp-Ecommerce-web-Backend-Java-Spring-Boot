package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.AvaPhoto;
import com.huynhuyn25.etherealapp.Model.CategoryPhoto;

import java.util.ArrayList;

public interface ICategoryPhotoService {
    public CategoryPhoto addCategoryPhoto(CategoryPhoto categoryPhoto);
    public CategoryPhoto updateCategoryPhoto(CategoryPhoto  categoryPhoto,int id);
    public boolean removeCategoryPhoto(int id);
    public ArrayList<CategoryPhoto> getAllCategoryPhoto();
    public CategoryPhoto getOneCategoryPhoto(int id);
}
