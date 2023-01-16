package xmlpeizhi;

import org.example.servie.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试单例/原型模式的区别
 */
public class ApplicationContextTest02 {
    public static void main(String[] args) {
        // 1.测试单例模式/原型模式【根据beans.xml】配置文件中的scope属性来进行更改
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService1 = (UserService) applicationContext.getBean("userService");
        UserService userService2 = (UserService) applicationContext.getBean("userService");
        UserService userService3 = (UserService) applicationContext.getBean("userService");
        UserService userService4 = (UserService) applicationContext.getBean("userService");
        System.out.println(userService1);
        System.out.println(userService2);
        System.out.println(userService3);
        System.out.println(userService4);

    }
}
