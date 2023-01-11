package org.example.factory;


import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

/**
 * 实现FactoryBean规范延迟实例化Bean
 * 对应的配置文件为beans9.xml
 */
public class BeanFactory03 implements FactoryBean<UserDao> {
    @Override
    public UserDao getObject() throws Exception {
        System.out.println("getObject方法被调用");
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
