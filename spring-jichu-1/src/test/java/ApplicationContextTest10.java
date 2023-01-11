import org.example.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * Bean的依赖注入配置
 * ? 普通数据类型，例如：String、int、boolean等，通过value属性指定。
 * ? 引用数据类型，例如：UserDaoImpl、DataSource等，通过ref属性指定。
 * ? 集合数据类型，例如：List、Map、Properties等。
 */
public class ApplicationContextTest10 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans10.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.printAttribute();
    }


}
