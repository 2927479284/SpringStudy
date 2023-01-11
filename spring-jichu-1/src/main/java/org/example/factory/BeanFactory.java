package org.example.factory;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;

/**
 * 静态工厂 直接类名.userDao()方法即可返回对应的对象
 *
 */
public class BeanFactory {


    private String name;

    public BeanFactory() {
        System.out.println("BeanFactory 构造函数执行成功");
    }

    public BeanFactory(String name) {
        this.name = name;
        System.out.println("有参构造执行成功");
    }


    public static UserDao userDao(String name){
        System.out.println("正在为您创建UserDao bean"+name);
        return new UserDaoImpl();
    }
}
