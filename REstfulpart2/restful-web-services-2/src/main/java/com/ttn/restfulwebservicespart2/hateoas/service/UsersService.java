package com.ttn.restfulwebservicespart2.hateoas.service;

import com.ttn.restfulwebservicespart2.hateoas.entity.User;

import java.util.List;

public interface UsersService {
    public List<User> getAllUsers();
    public User findUserById(int userId);
}
