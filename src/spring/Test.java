package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		//UserService userService = new UserService();
		
		//1.加载并且解析applicationContext.xml
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.获取工厂中的service对象了
		UserService userService = (UserService)factory.getBean("userService");
		
		//3.调用方法
		userService.findUsers();
		
		/**
		 * 客户提出新需求：
		 * 
		 * 		将原来的UserDaoImpl.java实现方式一
		 *      
		 *      修改为
		 *      
		 *      新的UserDaoImpl_2.java实现方式二
		 */

	}

}
