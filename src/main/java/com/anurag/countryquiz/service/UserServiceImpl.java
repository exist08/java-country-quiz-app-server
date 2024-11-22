package com.anurag.countryquiz.service;

import com.anurag.countryquiz.model.Users;
import com.anurag.countryquiz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(Users users) {
        userRepository.save(users);
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

//    @Override
//    public Users getLatestUser() {
//        return userRepository.findLatestUser();
//    }
}
