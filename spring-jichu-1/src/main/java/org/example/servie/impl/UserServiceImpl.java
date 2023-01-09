package org.example.servie.impl;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;
import org.example.servie.UserService;

public class UserServiceImpl implements UserService {

    public UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    @Override
    public void print() {
        System.out.println("UserServiceImpl执行print方法成功");
    }

}
