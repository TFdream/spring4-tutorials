package orange.spring4.aop.xml;

import orange.spring4.aop.xml.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopXmlApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-aop-xml.xml");

		UserService userService = (UserService) ctx.getBean("userService");
		//userService.login("ricky", "123");

		System.out.println("***********************");
		userService.login(null, "123456");

		ctx.close();
	}

}
