package xmlpeizhi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ����xml import��ǩ��������
 */
public class ApplicationContextTest13 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans13.xml");
        Object userDao1 = applicationContext.getBean("userService");//�����ȡ��bean,��beans13.xml�в�����
        System.out.println(userDao1);
    }
}
