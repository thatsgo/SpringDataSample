package com.sample.spring.service;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.spring.dao.pojo.User;
import com.sample.spring.repositoru.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public String doGetUser(Long id) {
		try {
			System.out.println("sdsad");
			System.out.println(Calendar.getInstance().getTime().toString());
			User user = new User();
			user.setName("Time " + Calendar.getInstance().getTime().toString());
			userRepository.save(user);
			System.out.println(userRepository.count());
			User userObj = userRepository.findOne(1l);
			System.out.println(userObj);
			userRepository.delete(1l);
			userObj = userRepository.findOne(1l);
		} catch (Exception e) {
			System.out.println(e);
		}

		return "SUCCESS";
	}

}
