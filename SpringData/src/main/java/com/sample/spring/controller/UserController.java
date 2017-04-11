package com.sample.spring.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.spring.service.UserService;

@RestController
@RequestMapping("/test")
public class UserController {

	@Autowired
	private UserService userService;
	

	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	@ResponseBody
	private String doTestUSer(@PathVariable Long userId) {
		try {
			userService.doGetUser(userId);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		return "Success";
	}

}
