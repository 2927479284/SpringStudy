package xmlpeizhi;

import org.example.servie.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ���Ե���/ԭ��ģʽ������
 */
public class ApplicationContextTest02 {
    public static void main(String[] args) {
        // 1.���Ե���ģʽ/ԭ��ģʽ������beans.xml�������ļ��е�scope���������и���
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
