import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * ͨ��ʵ��FactoryBean �ӿ���������Ӧ����
 */
public class ApplicationContextTest09 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans9.xml");
        Object userDao = classPathXmlApplicationContext.getBean("userDao");
        System.out.println(userDao);
    }
}
