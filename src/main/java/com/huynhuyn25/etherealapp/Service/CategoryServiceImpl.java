package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.Address;
import com.huynhuyn25.etherealapp.Model.Category;
import com.huynhuyn25.etherealapp.Model.CategoryPhoto;
import com.huynhuyn25.etherealapp.Repository.AddressRepository;
import com.huynhuyn25.etherealapp.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoryServiceImpl implements ICategoryService{
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        if(category!=null){
            return categoryRepository.save(category);
        }
        return null;
    }

    @Override
    public Category updateCategory(Category category, int id) {
        if(category!=null){
            Category category1 = categoryRepository.getById(id);
            if(category1!=null){
                category1.setName(category.getName());
                category1.setCategoryPhoto(new CategoryPhoto(category1.getCategoryPhoto().getIdPhoto(),
                        category.getCategoryPhoto().getNamePhoto(),category.getCategoryPhoto().getUrl()));
                return categoryRepository.save(category1);
            }
        }
        return null;
    }

    @Override
    public boolean removeCategory(int id) {
        if(id>=1){
            Category category = categoryRepository.getById(id);
            if(category!=null){
                categoryRepository.delete(category);
                return true;
            }
        }

        return false;
    }

    @Override
    public ArrayList<Category> getAllCategory() {
        return (ArrayList<Category>) categoryRepository.findAll();
    }

    @Override
    public Category getOneCategory(int id) {
        if(id>=1){
            Category category= categoryRepository.findById(id).get();
            if(category!=null){
                return category;
            }
        }
        return null;

    }
}
