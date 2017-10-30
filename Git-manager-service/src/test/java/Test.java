

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.system.IUserService;
import entity.system.User;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserService service=(IUserService)context.getBean("userService");
		User user=service.doGetById(1);
		System.out.print(user.getName());


	}

}
