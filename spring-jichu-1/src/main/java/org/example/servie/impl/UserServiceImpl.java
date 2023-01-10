package org.example.servie.impl;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;
import org.example.servie.UserService;
import org.springframework.beans.factory.InitializingBean;

public class UserServiceImpl implements UserService, InitializingBean {

//    public UserServiceImpl() {
//        System.out.println("我被实例化了");
//
//    }
    private String name;


    public UserServiceImpl(String name) {
        this.name = name;
        System.out.println("有参构造执行成功,name的值:"+this.name);
    }

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


    public void init(){
        System.out.println("初始化方法加载成功");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean初始化方法执行成功");
    }

    public void destruction(){
        System.out.println("销毁方法执行成功");
    }
}
