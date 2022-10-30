package com.ttn.restfulwebservicespart2.contentNegotiation.service;

import com.ttn.restfulwebservicespart2.contentNegotiation.entity.Users;

import java.util.List;

public interface UserService {
    public List<Users> getAllUsers();
    public Users addUser(Users user);
}
