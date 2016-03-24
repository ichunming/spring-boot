package com.study.zcm.spring_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.zcm.spring_boot.entity.User;
import com.study.zcm.spring_boot.service.UserService;

/**
 * User Controller
 * 2016/03/24
 * zhangchunming
 */
@Controller
public class UserController {
	@Autowired
	private UserService us;
	
	@RequestMapping("/User/addUser")
	public void addUser(){
		User user = new User();
		user.setName("test");
		user.setAge(25);
		
		us.addUser(user);
	}
	
	@RequestMapping("/User/getUsers")
	@ResponseBody
	public String getUser(){
		List<User> users = us.getUsers();
		
		StringBuilder sb = new StringBuilder();
		for(User user : users) {
			sb.append("uid:" + user.getUid() + " name:" + user.getName() + " age:" + user.getAge() + "</br>");
		}
		
		return sb.toString();
	}
}
