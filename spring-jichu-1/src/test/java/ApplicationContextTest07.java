import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的实例化之静态模式
 * 静态工厂方法实例化Bean
 * [通过bean工厂BeanFactory 内置方法userDao 返回一个userDao对象]
 */
public class ApplicationContextTest07 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Object userDao1 = classPathXmlApplicationContext.getBean("userDao1");
        System.out.println(userDao1);
    }
}
