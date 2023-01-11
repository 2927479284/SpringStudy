import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean��ʵ����֮��̬ģʽ
 * ��̬��������ʵ����Bean
 * [ͨ��bean����BeanFactory ���÷���userDao ����һ��userDao����]
 */
public class ApplicationContextTest07 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object userDao1 = classPathXmlApplicationContext.getBean("userDao1");
        System.out.println(userDao1);
    }
}
