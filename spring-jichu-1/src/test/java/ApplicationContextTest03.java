import org.example.servie.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ����bean���ӳټ���
 * lazy-init:������Ϊtrueʱ�����ǰBean��������ʱ����
 * ��ApplicationContext��ȡxml�����ļ���ʱ�򲻻�ȥ������Ӧ��beanʵ������
 * ������getBeanʱ�򴴽� ����Ϊ����
 */
public class ApplicationContextTest03 {

    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        userService.print();
        System.out.println(userService);
    }
}
