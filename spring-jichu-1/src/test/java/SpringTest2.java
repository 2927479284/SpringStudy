import org.example.dao.UserDao;
import org.example.servie.UserService;
import org.example.servie.impl.UserServiceImpl;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class SpringTest2 {

    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) defaultListableBeanFactory.getBean("userService");
        UserDao userDao = userService.getUserDao();
        userDao.printUserDao();
    }
}
