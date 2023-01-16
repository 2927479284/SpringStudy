package xmlpeizhi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试xml import标签引入配置
 */
public class ApplicationContextTest13 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans13.xml");
        Object userDao1 = applicationContext.getBean("userService");//这里读取的bean,在beans13.xml中不存在
        System.out.println(userDao1);
    }
}
