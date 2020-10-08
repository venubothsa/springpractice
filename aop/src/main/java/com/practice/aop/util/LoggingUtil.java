package com.practice.aop.util;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class LoggingUtil {
    @Before("getAll()")
    public void log() {
        log.info("getUser called from user controller");
    }

    @After("getAll()")
    public void logs() {
        log.info("getAll from user controller");
    }

    //public * com.practice.aop.controllers.UserController.getUsers()
    @Pointcut("execution(public * com.practice.aop.controllers.UserController.get*())")
    public void getAll() {
        log.info("getUser executed  from user controller");
    }

    @AfterThrowing("execution(public * com.practice.aop.controllers.UserController.getUsers())")
    public void error() {
        log.info("getUser executed  when exception occurred from user controller");
    }

    @AfterReturning("execution(public * com.practice.aop.controllers.UserController.getUsers())")
    public void returnObjects() {
        log.info("getUser executed  when return called  from user controller");
    }

    //pointcut method will not invoked, it's only uses reference package which is mention in pointcut annotation
    @Pointcut("within(com.practice.aop.controllers.UserController)")
    public void thirdAdice() {
        log.info("thirdAdice executed");
    }

    @Before("thirdAdice()")
    public void common() {
        log.info("All methods executed..");
    }
}
