package org.example.factory;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;

/**
 * 静态工厂 直接类名.userDao()方法即可返回对应的对象
 */
public class BeanFactory {

    public BeanFactory() {
        System.out.println("BeanFactory 构造函数执行成功");
    }

    public static UserDao userDao(){
        System.out.println("正在为您创建UserDao bean");
        return new UserDaoImpl();
    }
}
