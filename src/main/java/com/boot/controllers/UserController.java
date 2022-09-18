package com.boot.controllers;

import com.boot.entities.User;
import com.boot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/getUser")
    public List<User> getData(){
        return userService.getUserData();
    }

    @PostMapping(value ="/saveUser")
    public String saveData(@RequestBody User user){
        userService.saveUserData(user);
        return user.getName()  + "User Saved";
    }
}
