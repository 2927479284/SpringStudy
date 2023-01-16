package xmlpeizhi;

import org.example.dao.impl.UserDaoImpl;
import org.example.servie.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的初始化和销毁方法配置(扩展)
 * 以通过实现 InitializingBean 接口，完成一些Bean的初始化操作
 * 这里操作的是userService
 *
 */
public class ApplicationContextTest05 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // UserServiceImpl 实现了 InitializingBean 接口 重写了 afterPropertiesSet()方法
        // 执行的时期比spring提供的初始化配置调用方法还要提前
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        System.out.println(userService);
    }
}
