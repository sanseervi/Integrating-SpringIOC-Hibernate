package com.zomato.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spr {
	static UserProfile profile=test();
	
	public static UserProfile test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//Triangle triangle = new Triangle();
		//triangle.draw();
		UserProfile profile=(UserProfile)context.getBean("profile");
		profile.Display();
		return profile;
		
	}

}
