package cn.sxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sxt.service.UserService;
import cn.sxt.service.impl.UserServiceImpl;
import cn.sxt.service.impl.UserServiceImpl2;

public class testof {
	public static void main(String[] args) {//测试Spring依赖注入。
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		UserService userService = (UserService)context.getBean(UserService.class);
		userService.getAll();
		System.out.println(userService.getAll());
	}
}
