/**
 * User Service
 * 2016/03/24
 * zhangchunming
 */
package com.study.zcm.spring_boot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.zcm.spring_boot.entity.User;
import com.study.zcm.spring_boot.repository.UserRepository;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository ur;
	
	public void addUser(User user) {
		ur.save(user);
	}
	
	public List<User> getUsers() {
		return ur.findAll();
	}
}
