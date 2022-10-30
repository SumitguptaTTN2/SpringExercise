package com.ttn.restfulwebservicespart2.contentNegotiation.service;

import com.ttn.restfulwebservicespart2.contentNegotiation.entity.Users;
import com.ttn.restfulwebservicespart2.contentNegotiation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    public List<Users> getAllUsers(){
        return userRepository.retrieveUsers();
    }

    public Users addUser(Users user){
        return userRepository.addNewUsers(user);
    }
}
