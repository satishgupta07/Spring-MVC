package com.satish07.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satish07.dao.UserDao;
import com.satish07.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public int createUser(User user) {
		return this.userDao.saveUser(user);
	}
}
