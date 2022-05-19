package com.huynhuyn25.etherealapp.Model;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_category_phto")
    private CategoryPhoto categoryPhoto;

    public Category(int id, String name, CategoryPhoto categoryPhoto) {
        this.id = id;
        this.name = name;
        this.categoryPhoto = categoryPhoto;
    }

    public Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryPhoto getCategoryPhoto() {
        return categoryPhoto;
    }

    public void setCategoryPhoto(CategoryPhoto categoryPhoto) {
        this.categoryPhoto = categoryPhoto;
    }
}
