import org.example.servie.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试bean的延迟加载
 * lazy-init:当设置为true时则代表当前Bean启动了延时加载
 * 在ApplicationContext读取xml配置文件的时候不会去创建对应的bean实例对象
 * 而是在getBean时候创建 以下为案例
 */
public class ApplicationContextTest03 {

    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        userService.print();
        System.out.println(userService);
    }
}
