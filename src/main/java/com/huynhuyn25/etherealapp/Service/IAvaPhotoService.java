package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.Address;
import com.huynhuyn25.etherealapp.Model.AvaPhoto;

import java.util.ArrayList;

public interface IAvaPhotoService {
    public AvaPhoto addAvaPhoto(AvaPhoto avaPhoto);
    public AvaPhoto updateAvaPhoto(AvaPhoto  avaPhoto,int id);
    public boolean removeAvaPhoto(int id);
    public ArrayList<AvaPhoto> getAllAvaPhoto();
    public AvaPhoto getOneAvaPhoto(int id);
}
