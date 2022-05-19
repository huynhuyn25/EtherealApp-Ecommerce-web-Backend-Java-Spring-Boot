package com.huynhuyn25.etherealapp.Model;

import javax.persistence.*;

@Entity
@Table(name = "photo")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPhoto;
    private String namePhoto;
    private String url;

    public Photo() {
    }

    public Photo(int idPhoto, String namePhoto, String url) {
        this.idPhoto = idPhoto;
        this.namePhoto = namePhoto;
        this.url = url;
    }

    public int getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(int idPhoto) {
        this.idPhoto = idPhoto;
    }

    public String getNamePhoto() {
        return namePhoto;
    }

    public void setNamePhoto(String namePhoto) {
        this.namePhoto = namePhoto;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
