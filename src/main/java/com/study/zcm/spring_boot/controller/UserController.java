package com.study.zcm.spring_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.zcm.spring_boot.entity.User;
import com.study.zcm.spring_boot.service.UserService;

/**
 * User Controller 2016/03/24 zhangchunming
 */
@Controller
public class UserController {
	@Autowired
	private UserService us;

	@RequestMapping("/User/addUser")
	@ResponseBody
	public String addUser(){
		try{
			User user = new User();
			user.setName("test");
			user.setAge(25);
			
			us.addUser(user);
		}catch(Exception ex){
			return "add user fail";
		}
		return "add user success";
	}

	@RequestMapping("/User/getUsers")
	@ResponseBody
	public String getUsers() {
		StringBuilder sb = new StringBuilder();
		try{
			List<User> users = us.getUsers();
			if(null == users || users.size() <= 0){
				return "no user";
			}
			for (User user : users) {
				sb.append("uid:" + user.getUid() + " name:" + user.getName() + " age:" + user.getAge() + "</br>");
			}
		}catch(Exception ex){
			return "get users fail";
		}
		

		return sb.toString();
	}

	@RequestMapping("/User/deleteAllUsers")
	@ResponseBody
	public String deleteAllUsers() {
		try{
			us.deleteAllUsers();
		} catch(Exception ex){
			return "delete users fail";
		}
		return "delete users success";
	}
}
