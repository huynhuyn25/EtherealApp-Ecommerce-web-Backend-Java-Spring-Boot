package com.huynhuyn25.etherealapp.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ava_photo")
public class AvaPhoto extends Photo{
    public AvaPhoto() {
    }

    public AvaPhoto(int idPhoto, String namePhoto, String url) {
        super(idPhoto, namePhoto, url);
    }

}
