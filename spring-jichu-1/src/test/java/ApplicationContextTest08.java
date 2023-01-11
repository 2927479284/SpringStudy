import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 实例工厂方法实例化Bean
 * 对比 ApplicationContextTest07.java 静态工厂方法实例化Bean
 * 静态工厂不需要去创建对应的无参构造方法 可以通过[类名.getBean() 静态方法]返回一个对象
 * 而实例工厂则相反需要给当前bean工厂构建一个工厂对象，再去调用内部的方法方能返回一个对象(非静态)
 */
public class ApplicationContextTest08 {

    /**
     * 实例工厂
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans8.xml");
        System.out.println("aaa");
    }
}
