package com.ttn.restfulwebservicespart2.contentNegotiation.repository;

import com.ttn.restfulwebservicespart2.contentNegotiation.entity.Users;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private static List<Users> user = new ArrayList<>();
    static {
        user.add(new Users("Sumit"));
        user.add(new Users("Puneet"));
        user.add(new Users("Lalit"));

    }

    public List<Users> retrieveUsers(){
        return user;
    }

    public Users addNewUsers(Users user){
        UserRepository.user.add(user);
        return user;
    }
}
