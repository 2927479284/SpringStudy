package xmlpeizhi;

import org.example.servie.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的初始化和销毁方法配置
 * 在配置文件中对应的bean上面配置[init-method,destroy-method]
 */
public class ApplicationContextTest04 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService1 = (UserService) classPathXmlApplicationContext.getBean("userService");
        System.out.println(userService1);
        classPathXmlApplicationContext.close();
    }
}
