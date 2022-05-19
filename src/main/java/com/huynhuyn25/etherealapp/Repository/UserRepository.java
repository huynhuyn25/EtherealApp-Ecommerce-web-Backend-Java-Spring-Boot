package com.huynhuyn25.etherealapp.Repository;


import com.huynhuyn25.etherealapp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository  extends JpaRepository<User,Integer>{
    @Query("SELECT user FROM User user WHERE user.Username=?1 and user.password=?2")
    public User findUserByUsernamePassword(String Username, String password);

}
