package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.Address;
import com.huynhuyn25.etherealapp.Model.Category;

import java.util.ArrayList;

public interface ICategoryService {
    public Category addCategory(Category address);
    public Category updateCategory(Category address,int id);
    public boolean removeCategory(int id);
    public ArrayList<Category> getAllCategory();
    public Category getOneCategory(int id);
}
