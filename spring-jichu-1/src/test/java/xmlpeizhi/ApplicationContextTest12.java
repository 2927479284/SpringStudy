package xmlpeizhi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ����xml�������ļ� �����ȡ������ָ���Ļ����ռ�����&����������
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
