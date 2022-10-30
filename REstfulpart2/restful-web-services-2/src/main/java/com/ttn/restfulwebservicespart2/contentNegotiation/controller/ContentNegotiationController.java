package com.ttn.restfulwebservicespart2.contentNegotiation.controller;

import com.ttn.restfulwebservicespart2.contentNegotiation.entity.Users;
import com.ttn.restfulwebservicespart2.contentNegotiation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/ContentNegotiation")
public class ContentNegotiationController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/getAll")
    public List<Users> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping(path = "/addUser")
    public ResponseEntity<Users> addUser(@Valid @RequestBody Users user){
        Users newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
}
