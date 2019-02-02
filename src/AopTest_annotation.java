import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author percy
 * @create 2019-02-02  下午11:23
 * @descreption:
 **/
public class AopTest_annotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        MyBook myBook = (MyBook) applicationContext.getBean("myBook");
        myBook.add();
    }
}
