package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
    UserRepo userRepo;

    public User addusertodb(User user){

        return userRepo.save(user);
    }


    
}
