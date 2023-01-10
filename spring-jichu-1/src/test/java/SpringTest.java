import org.example.servie.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class SpringTest {

    /**
     * 传统BeanFactory方法
     * 【麻烦 后续使用ApplicationContext 对 BeanFactory进行了一定的封装读取更加简单】
     * @param args
     */
    public static void main(String[] args) {
        //步骤
        //1.创建工厂对象
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        //2.创建一个读取器(.xml)文件
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        //3.读取配置文件绑定工厂
        xmlBeanDefinitionReader.loadBeanDefinitions("beans.xml");
        //4.根据ID获取实力对象
        UserService userService = (UserService) defaultListableBeanFactory.getBean("userService");
        //5.调用方法测试
        userService.print();
    }
}
