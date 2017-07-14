package com.cdja.run;

import java.util.Date;

import com.cdja.pojo.User;
import com.cdja.testservice.UserService;
import com.cdja.testservice.UserServiceImpl;

public class UserTest {
	
	private static UserService us;
	
	
	public static void main(String[] args) {
		us = new UserServiceImpl();
		us.add("wang", 13, true, 10000, new Date());
		System.out.println(us.getNameById(1));
		System.out.println(us.getUserById(1));
		User user = new User();
		user.setId(1);
		user.setName("love");
		System.out.println(us.update(user));
		
		
	}
}
