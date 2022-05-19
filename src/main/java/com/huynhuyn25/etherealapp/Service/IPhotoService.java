package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.Photo;

import java.util.ArrayList;

public interface IPhotoService {
    public Photo addPhoto(Photo photo);
    public Photo updatePhoto(Photo photo, int id);
    public boolean removePhoto(int id);
    public ArrayList<Photo> getAllPhoto();
    public Photo getOnePhoto(int id);
}
