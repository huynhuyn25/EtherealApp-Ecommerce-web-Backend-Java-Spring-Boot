package com.huynhuyn25.etherealapp.Controller;

import com.huynhuyn25.etherealapp.Model.Address;
import com.huynhuyn25.etherealapp.Model.Photo;
import com.huynhuyn25.etherealapp.Model.ProductPhoto;
import com.huynhuyn25.etherealapp.Model.User;
import com.huynhuyn25.etherealapp.Service.IAddressService;
import com.huynhuyn25.etherealapp.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    //trả về thông tin người dùng nếu nhập đúng tài khoản mật khẩu
    @GetMapping("/login")
    public User getUserByNamePassword(@RequestParam String username,@RequestParam String Password){
        return iUserService.getOneUserByUsernamePassword(username,Password);
    }
    //tạo mới tài khoản người dùng
    @PostMapping("/signup")
    public User addUser(@RequestBody User user){
        return iUserService.addUser(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestParam int id, @RequestBody User user){
        return iUserService.updateUser(user,id);
    }

    @GetMapping("/get")
    public User getOneUser(@RequestParam int id){
        return iUserService.getOneUser(id);
    }
}
