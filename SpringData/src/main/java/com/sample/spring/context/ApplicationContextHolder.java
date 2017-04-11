package com.sample.spring.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.sample.spring.service.UserService;

public class ApplicationContextHolder implements ApplicationContextAware {

	private static ApplicationContext appContext;
	
	@Autowired
	private UserService userService;

	
	public void setApplicationContext(ApplicationContext arg0) {
		System.out.println("setting context file ........");
		appContext = arg0;
		userService.doGetUser(222l);
	}

	public ApplicationContext getAppContext() {

		return appContext;
	}

}