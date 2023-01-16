package xmlpeizhi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试xml多配置文件 这里读取的是你指定的环境空间配置&公共的配置
 */
public class ApplicationContextTest12 {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active","dev");
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans12.xml");
        Object userDao1 = applicationContext.getBean("userDao2");
        System.out.println(userDao1);
    }
}
