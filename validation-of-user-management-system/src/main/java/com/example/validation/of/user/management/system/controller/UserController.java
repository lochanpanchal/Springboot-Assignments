package com.example.validation.of.user.management.system.controller;

import com.example.validation.of.user.management.system.model.User;
import com.example.validation.of.user.management.system.service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    //read
    @GetMapping("users")
    List<User> getAllUsers()
    {
        return userService.getAllUser();
    }

    //get user by id
//    @GetMapping("/{userid}")
//    User getUser(@PathVariable Long userid){
//        return userService.getUser(userid);
//    }


    //create
    @PostMapping("users")
    String addUsers(@RequestBody @Valid List<User> users)
    {
        return userService.createUsers(users);
    }

    @PostMapping("user")
    String addUser(@Valid @RequestBody User user)
    {
        return userService.createUser(user);
    }

    //delete :
    @DeleteMapping("user")
    String removeUser(@RequestParam @Max(1000) Integer id)
    {
        return userService.removeUser(id);
    }

    @RequestMapping(value = "user/{id}/emai/{emailId}",method = PUT)
    String updateEmail(@PathVariable Integer id, @PathVariable @Email String emailId){
        return userService.updateEmail(id,emailId);
    }

}
