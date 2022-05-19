package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.AvaPhoto;
import com.huynhuyn25.etherealapp.Model.ProductPhoto;
import com.huynhuyn25.etherealapp.Repository.AvaPhotoRepository;
import com.huynhuyn25.etherealapp.Repository.ProductPhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductPhotoServiceImpl implements IProductPhotoService{
    @Autowired
    private ProductPhotoRepository productPhotoRepository;

    @Override
    public ProductPhoto addProductPhoto(ProductPhoto productPhoto) {
        if(productPhoto!=null){
            return productPhotoRepository.save(productPhoto);
        }
        return null;
    }

    @Override
    public ProductPhoto updateProductPhoto(ProductPhoto productPhoto, int id) {
        if(productPhoto!=null){
            ProductPhoto productPhoto1 = productPhotoRepository.getById(id);
            if(productPhoto1!=null){
                productPhoto1.setNamePhoto(productPhoto.getNamePhoto());
                productPhoto1.setUrl(productPhoto.getUrl());
                return productPhotoRepository.save(productPhoto1);
            }
        }
        return null;
    }

    @Override
    public boolean removeProductPhoto(int id) {
        if(id>=1){
            ProductPhoto productPhoto = productPhotoRepository.getById(id);
            if(productPhoto!=null){
                productPhotoRepository.delete(productPhoto);
                return true;
            }
        }

        return false;
    }

    @Override
    public ArrayList<ProductPhoto> getAllProductPhoto() {
        return (ArrayList<ProductPhoto>) productPhotoRepository.findAll();
    }

    @Override
    public ProductPhoto getOneProductPhoto(int id) {
        if(id>=1){
            ProductPhoto productPhoto = productPhotoRepository.findById(id).get();
            if(productPhoto!=null){
                return productPhoto;
            }
        }
        return null;

    }
}
