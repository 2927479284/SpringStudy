package xmlpeizhi;

import org.example.servie.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean�ĳ�ʼ�������ٷ�������
 * �������ļ��ж�Ӧ��bean��������[init-method,destroy-method]
 */
public class ApplicationContextTest04 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService1 = (UserService) classPathXmlApplicationContext.getBean("userService");
        System.out.println(userService1);
        classPathXmlApplicationContext.close();
    }
}
