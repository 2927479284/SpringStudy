import org.example.dao.UserDao;
import org.example.servie.UserService1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * ͨ�������ļ�ʵ��bean���Զ�ע��
 * ��Ӧ�������ļ�beans11.xml
 */
public class ApplicationContextTest11 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans11.xml");
        UserService1 userService1 = (UserService1) applicationContext.getBean("userService1");
        userService1.print();
    }


}
