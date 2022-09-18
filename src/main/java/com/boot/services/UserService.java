package com.boot.services;

import com.boot.entities.User;
import com.boot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUserData(){
        return userRepository.findAll();
    }

    /*public void getJsonData(){
        System.out.println(https://api.openweathermap.org/data/2.5/forecast?q=london&appid=d2929e9483efc82c82c32ee7e02d563e&cnt=10");
    }*/

    public void saveUserData(User user){
        userRepository.save(user);
    }
}
