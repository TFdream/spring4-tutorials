package orange.spring4.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2017-03-04 21:07
 */
public class LifecycleApp {

    public static void main(String[] args) throws InterruptedException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        ExampleBean exampleBean = (ExampleBean) context.getBean("exampleBean");
        System.out.println(exampleBean);

        //休眠3秒钟
        TimeUnit.SECONDS.sleep(3);

        context.close();
    }
}
