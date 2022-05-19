package com.huynhuyn25.etherealapp.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "category_photo")
public class CategoryPhoto extends Photo{
    public CategoryPhoto() {
    }

    public CategoryPhoto(int idPhoto, String namePhoto, String url) {
        super(idPhoto, namePhoto, url);
    }
}
