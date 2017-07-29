package orange.spring.research;

import orange.spring.research.model.User;
import orange.spring.research.service.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryDemo {

    public static void main( String[] args ) {

        ClassPathResource resource = new ClassPathResource("spring-bean.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);

        User user = new User();
        user.setId(15L);
        user.setName("ricky");
        //测试类
        UserService userService = factory.getBean("userService", UserService.class);
        boolean success = userService.addUser(user);
        System.out.println("success:"+success);
    }
}
