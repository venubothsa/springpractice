package com.practice.aop.controllers;

import com.practice.aop.domain.User;
import com.practice.aop.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path = "/users")
    public List<User> getUsers() {
        log.info("get user called after aspect class");
        return userService.findAll();
    }
    @GetMapping(path = "/hello")
    public String hello() {
        log.info("hello called after aspect class");
        return "Hello team";

    }
    @GetMapping(path = "/welcome")
    public String getWelcome() {
        log.info("Welcome called after aspect class");
        return "Welcome team";

    }
}
