package org.example.servie.impl;


import org.example.dao.UserDao;
import org.example.servie.UserService1;

public class UserServiceImpl1 implements UserService1 {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        System.out.println("setUserDao被成功调用了");
        this.userDao = userDao;
    }

    @Override
    public void print() {
        System.out.println("UserDao："+userDao);
    }
}
