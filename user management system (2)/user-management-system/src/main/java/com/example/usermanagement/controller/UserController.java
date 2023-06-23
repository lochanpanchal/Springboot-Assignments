package com.example.usermanagement.controller;

import com.example.usermanagement.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final List<User> users = new ArrayList<>();

    @PostMapping("/add")
    public void addUser(@RequestBody User user){
        users.add(user);
    }

    @GetMapping("/{userId}")
    public  User getUser(@PathVariable("userId") Long userId){
        for(User user : users){
            if(user.getUserId() == (userId)){
                return user;
            }
        }
        return null;
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return users;
    }

    @PutMapping("/{userId}")
    public void updataUserInfo(@PathVariable("userId") Long userId, @RequestBody User updateUser){
        for(User user : users){
            if(user.getUserId() == (userId)){
                user.setName(updateUser.getName());
                user.setUserName(updateUser.getUserName());
                user.setAddress(updateUser.getAddress());
                user.setPhoneNumber(updateUser.getPhoneNumber());
                return;
            }
        }
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        users.removeIf(user -> user.getUserId() == (userId));
    }



}
