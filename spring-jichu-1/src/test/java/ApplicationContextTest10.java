import org.example.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/***
 * Bean������ע������
 * ? ��ͨ�������ͣ����磺String��int��boolean�ȣ�ͨ��value����ָ����
 * ? �����������ͣ����磺UserDaoImpl��DataSource�ȣ�ͨ��ref����ָ����
 * ? �����������ͣ����磺List��Map��Properties�ȡ�
 */
public class ApplicationContextTest10 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans10.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.printAttribute();
    }


}
