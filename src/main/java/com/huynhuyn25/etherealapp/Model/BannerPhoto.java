package com.huynhuyn25.etherealapp.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "banner_photo")
public class BannerPhoto extends Photo{
    public BannerPhoto() {
    }

    public BannerPhoto(int idPhoto, String namePhoto, String url) {
        super(idPhoto, namePhoto, url);
    }
}
