package com.huynhuyn25.etherealapp.Service;

import com.huynhuyn25.etherealapp.Model.Product;
import com.huynhuyn25.etherealapp.Model.User;
import com.huynhuyn25.etherealapp.Repository.ProductRepository;
import com.huynhuyn25.etherealapp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        if(user!=null){
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public User updateUser(User user, int id) {
        if(user!=null){
            User user1 = userRepository.getById(id);
            if(user1!=null){
                user1.setUsername(user.getUsername());
                user1.setAvaPhoto(user.getAvaPhoto());
                user1.setCart(user.getCart());
                user1.setEmail(user.getEmail());
                user1.setName(user.getName());
                user1.setDateOfBirth(user.getDateOfBirth());
                user1.setNumberPhone(user.getNumberPhone());
                user1.setPassword(user.getPassword());
                return userRepository.save(user1);
            }
        }
        return null;
    }

    @Override
    public boolean removeUser(int id) {
        if(id>=1){
            User user = userRepository.getById(id);
            if(user!=null){
                userRepository.delete(user);
                return true;
            }
        }

        return false;
    }

    @Override
    public ArrayList<User> getAllUser() {
        return (ArrayList<User>) userRepository.findAll();
    }

    @Override
    public User getOneUser(int id) {
        if(id>=1){
            User user = userRepository.findById(id).get();
            if(user!=null){
                return user;
            }
        }
        return  null;
    }
    @Override
    public User getOneUserByUsernamePassword(String username,String Password) {
        if(!username.equals("")&&!Password.equals("")){
            User user = userRepository.findUserByUsernamePassword(username,Password);
            if(user!=null){
                return user;
            }
        }
        return  new User();
    }
}
