package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.AvaPhoto;
import com.huynhuyn25.etherealapp.Model.ProductPhoto;

import java.util.ArrayList;

public interface IProductPhotoService {
    public ProductPhoto addProductPhoto(ProductPhoto avaPhoto);
    public ProductPhoto updateProductPhoto(ProductPhoto  avaPhoto,int id);
    public boolean removeProductPhoto(int id);
    public ArrayList<ProductPhoto> getAllProductPhoto();
    public ProductPhoto getOneProductPhoto(int id);
}
