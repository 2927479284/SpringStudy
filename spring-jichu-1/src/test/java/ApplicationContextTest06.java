import org.example.servie.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean的实例化配置
 * 1.ClassPathXmlApplicationContext("beans.xml")时会去调用对应的类的构造方法
 * 例:此时对应的构造方法不存在则spring会报找到对应构造方法错误。
 * Failed to instantiate [org.example.servie.impl.UserServiceImpl]:
 * No default constructor found; nested exception is java.lang
 *
 * 2.如没有无参构造方法，则需要给有参构造传值。[用的很少]
 * 需要在配种文件中写入 <constructor-arg name="对应的参数名" value="参数所对应的值"/>
 */
public class ApplicationContextTest06 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
        System.out.println(userService);
    }
}
