package orange.spring4.ioc.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-ioc.xml");
		
		//2. 从 IOC 容器中获取 bean 的实例
		UserDAO userDAO = (UserDAO) ctx.getBean("userDAO");
		System.out.println(userDAO.toString());
		
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		
		UserService userService = (UserService) ctx.getBean("service");
		System.out.println(userService);
		
		Action action = (Action) ctx.getBean("action");
		System.out.println(action);
		
		ctx.close();
	}

}
