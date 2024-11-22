package com.anurag.countryquiz.service;

import com.anurag.countryquiz.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public void saveUser(Users users);
    public List<Users> getAllUsers();
//    public Users getLatestUser();
}
