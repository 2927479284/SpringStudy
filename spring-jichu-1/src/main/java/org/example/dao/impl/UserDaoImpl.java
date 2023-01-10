package org.example.dao.impl;

import org.example.dao.UserDao;
import org.springframework.beans.factory.InitializingBean;

public class UserDaoImpl implements UserDao {
    @Override
    public void printUserDao() {
        System.out.println("UserDao->Print方法执行成功");
    }


}
