package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.Product;
import com.huynhuyn25.etherealapp.Model.User;

import java.util.ArrayList;

public interface IUserService {
    public User addUser(User manufacturer);
    public User updateUser(User manufacturer,int id);
    public boolean removeUser(int id);
    public ArrayList<User> getAllUser();
    public User getOneUser(int id);
    public User getOneUserByUsernamePassword(String username,String Password);
}
