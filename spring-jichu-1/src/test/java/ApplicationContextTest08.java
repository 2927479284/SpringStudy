import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ʵ����������ʵ����Bean
 * �Ա� ApplicationContextTest07.java ��̬��������ʵ����Bean
 * ��̬��������Ҫȥ������Ӧ���޲ι��췽�� ����ͨ��[����.getBean() ��̬����]����һ������
 * ��ʵ���������෴��Ҫ����ǰbean��������һ������������ȥ�����ڲ��ķ������ܷ���һ������(�Ǿ�̬)
 */
public class ApplicationContextTest08 {

    /**
     * ʵ������
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans8.xml");
        System.out.println("aaa");
    }
}
