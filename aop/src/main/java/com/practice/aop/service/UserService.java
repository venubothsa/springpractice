package com.practice.aop.service;

import com.practice.aop.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private static List<User> users=new ArrayList<>();
    static {
        users.add(new User("venu","vizag","44444"));
        users.add(new User("teju","hyd","44444"));
        users.add(new User("vinod","vizag","44444"));
        users.add(new User("kapil","vizag","44444"));
    }
    public  List<User> findAll(){
        return users;
    }
}
