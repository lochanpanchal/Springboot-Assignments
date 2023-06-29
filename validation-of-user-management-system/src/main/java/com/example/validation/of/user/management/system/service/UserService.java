package com.example.validation.of.user.management.system.service;

import com.example.validation.of.user.management.system.model.User;
import com.example.validation.of.user.management.system.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public String updateEmail(Integer id, String emailId){
        List<User> originalList = getAllUser();
        for(User u : originalList)
        {
            if(id.equals(u.getUserId())){
                //originalList.remove(u);
                u.setUserEmail(emailId);
                //originalList.add(u);

                return "updated";
            }
        }

        return "id not found";
    }

    public List<User> getAllUser() {
        return userRepo.getUsers();
    }

    public String createUsers(List<User> users) {
        List<User> originalList = getAllUser();
        originalList.addAll(users);
        return "new users added";
    }

    public String createUser(User user) {
        List<User> originalList = getAllUser();
        originalList.add(user);
        return "new user added";
    }


    public String removeUser(Integer id) {
        List<User> originalList = getAllUser();
        for(User u : originalList){
            if(id.equals(u.getUserId())){
                originalList.remove(u);
                return "removed";
            }
        }
        return "removed";
    }



}
