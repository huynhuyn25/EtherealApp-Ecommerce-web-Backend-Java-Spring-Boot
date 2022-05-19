package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.Address;
import com.huynhuyn25.etherealapp.Model.AvaPhoto;
import com.huynhuyn25.etherealapp.Repository.AddressRepository;
import com.huynhuyn25.etherealapp.Repository.AvaPhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AvaPhotoServiceImpl implements IAvaPhotoService{
    @Autowired
    private AvaPhotoRepository avaPhotoRepository;

    @Override
    public AvaPhoto addAvaPhoto(AvaPhoto avaPhoto) {
        if(avaPhoto!=null){
            return avaPhotoRepository.save(avaPhoto);
        }
        return null;
    }

    @Override
    public AvaPhoto updateAvaPhoto(AvaPhoto avaPhoto, int id) {
        if(avaPhoto!=null){
            AvaPhoto avaPhoto1 = avaPhotoRepository.getById(id);
            if(avaPhoto1!=null){
                avaPhoto1.setNamePhoto(avaPhoto.getNamePhoto());
                avaPhoto1.setUrl(avaPhoto.getUrl());
                return avaPhotoRepository.save(avaPhoto1);
            }
        }
        return null;
    }

    @Override
    public boolean removeAvaPhoto(int id) {
        if(id>=1){
            AvaPhoto avaPhoto = avaPhotoRepository.getById(id);
            if(avaPhoto!=null){
                avaPhotoRepository.delete(avaPhoto);
                return true;
            }
        }

        return false;
    }

    @Override
    public ArrayList<AvaPhoto> getAllAvaPhoto() {
        return (ArrayList<AvaPhoto>) avaPhotoRepository.findAll();
    }

    @Override
    public AvaPhoto getOneAvaPhoto(int id) {
        if(id>=1){
            AvaPhoto avaPhoto = avaPhotoRepository.findById(id).get();
            if(avaPhoto!=null){
                return avaPhoto;
            }
        }
        return null;

    }
}
