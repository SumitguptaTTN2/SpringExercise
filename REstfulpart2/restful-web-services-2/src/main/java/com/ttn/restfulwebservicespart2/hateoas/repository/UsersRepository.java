package com.ttn.restfulwebservicespart2.hateoas.repository;

import com.ttn.restfulwebservicespart2.hateoas.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersRepository {
    private static List<User> userList = new ArrayList<>();
    static {
        userList.add(new User("Sumit","Sumit@Gmail.com",1));
        userList.add(new User("Punnet", "puneet@Gmail.com", 2));
        userList.add(new User("Lalit", "lalit@gmail.com",3));
    }

    public List<User> retrieveUsers(){
        return userList;
    }
}
