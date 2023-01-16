package xmlpeizhi;

import org.example.dao.impl.UserDaoImpl;
import org.example.servie.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean�ĳ�ʼ�������ٷ�������(��չ)
 * ��ͨ��ʵ�� InitializingBean �ӿڣ����һЩBean�ĳ�ʼ������
 * �����������userService
 *
 */
public class ApplicationContextTest05 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        // UserServiceImpl ʵ���� InitializingBean �ӿ� ��д�� afterPropertiesSet()����
        // ִ�е�ʱ�ڱ�spring�ṩ�ĳ�ʼ�����õ��÷�����Ҫ��ǰ
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        System.out.println(userService);
    }
}
