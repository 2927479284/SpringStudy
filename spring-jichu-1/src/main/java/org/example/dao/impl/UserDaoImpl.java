package org.example.dao.impl;

import org.example.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void printUserDao() {
        System.out.println("UserDao->Print方法执行成功");
    }
}
