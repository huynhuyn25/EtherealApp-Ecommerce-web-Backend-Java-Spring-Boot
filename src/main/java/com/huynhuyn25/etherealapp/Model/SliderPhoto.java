package com.huynhuyn25.etherealapp.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "slider_photo")
public class SliderPhoto extends Photo{
    private String title;
    private String description;

    public SliderPhoto(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public SliderPhoto(int idPhoto, String namePhoto, String url, String title, String description) {
        super(idPhoto, namePhoto, url);
        this.title = title;
        this.description = description;
    }

    public SliderPhoto() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
