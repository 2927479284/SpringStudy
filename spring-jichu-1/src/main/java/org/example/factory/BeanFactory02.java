package org.example.factory;


import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;

/**
 * 实例工厂 方法非静态 对应xml文件beans8.xml
 * 这里未指定无参构造也能执行成功
 * 但如果有有参构造方法时候必须要指定无参构造方法
 */
public class BeanFactory02 {


    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
