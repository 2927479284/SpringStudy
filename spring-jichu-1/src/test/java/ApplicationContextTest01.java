import org.example.servie.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用ApplicationContext 读取beans.xml进行 读取bean
 */

public class ApplicationContextTest01 {


    public static void main(String[] args) {
        // 1.创建ApplicationContext 读取beans.xml
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // 2.读取对应的bean
        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.print();
    }



}
