import org.example.servie.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ʹ��ApplicationContext ��ȡbeans.xml���� ��ȡbean
 */

public class ApplicationContextTest01 {


    public static void main(String[] args) {
        // 1.����ApplicationContext ��ȡbeans.xml
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // 2.��ȡ��Ӧ��bean
        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.print();
    }



}
