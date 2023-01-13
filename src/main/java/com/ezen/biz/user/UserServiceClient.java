package com.ezen.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.ezen.biz.dto.UserVO;

public class UserServiceClient {

	public static void main(String[] args) {
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		UserService service = (UserService) container.getBean("userService");
		
		UserVO user = new UserVO();
		user.setId("test");
		user.setPassword("test123");
		
		UserVO print = service.getUser(user);
		System.out.println(print);
		
		container.close();
	}

}
