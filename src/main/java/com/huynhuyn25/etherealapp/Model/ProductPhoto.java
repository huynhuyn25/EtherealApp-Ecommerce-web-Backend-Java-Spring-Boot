package com.huynhuyn25.etherealapp.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product_photo")
public class ProductPhoto extends Photo{
    public ProductPhoto() {
    }

    public ProductPhoto(int idPhoto, String namePhoto, String url) {
        super(idPhoto, namePhoto, url);
    }
}
