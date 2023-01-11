package org.example.dao.impl;

import org.example.dao.UserDao;
import org.example.servie.UserService;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public void printUserDao() {
        System.out.println("UserDao->Print方法执行成功");
    }


    /**
     * 基础数据类型注入
     */
    private List<Integer> list;
    public void setList(List<Integer> list) {
        System.out.println("setList方法被调用");
        this.list = list;
    }

    /**
     * 引用类型被调用
     */
    private List<UserService> userServiceList;
    public void setUserServiceList(List<UserService> userServiceList) {
        System.out.println("setUserServiceList被调用");
        this.userServiceList = userServiceList;
    }

    public void printAttribute(){
        System.out.println(this.list);
        System.out.println(this.userServiceList);
    }

}
