import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * 通过实现FactoryBean 接口来创建对应对象
 */
public class ApplicationContextTest09 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans9.xml");
        Object userDao = classPathXmlApplicationContext.getBean("userDao");
        System.out.println(userDao);
    }
}
