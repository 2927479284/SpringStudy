import org.example.servie.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean��ʵ��������
 * 1.ClassPathXmlApplicationContext("beans.xml")ʱ��ȥ���ö�Ӧ����Ĺ��췽��
 * ��:��ʱ��Ӧ�Ĺ��췽����������spring�ᱨ�ҵ���Ӧ���췽������
 * Failed to instantiate [org.example.servie.impl.UserServiceImpl]:
 * No default constructor found; nested exception is java.lang
 *
 * 2.��û���޲ι��췽��������Ҫ���вι��촫ֵ��[�õĺ���]
 * ��Ҫ�������ļ���д�� <constructor-arg name="��Ӧ�Ĳ�����" value="��������Ӧ��ֵ"/>
 */
public class ApplicationContextTest06 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        System.out.println(userService);
    }
}
