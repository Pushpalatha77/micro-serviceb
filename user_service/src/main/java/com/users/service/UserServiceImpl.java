package com.users.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.users.entity.User;

@Service
public class UserServiceImpl implements UserService{

	List<User> list=List.of(
			new User(1311L,"Biswajit Pradhan","9278770417"),
			new User(1312L,"Debasish Pradhan","7657015669"),
			new User(1313L,"Ranjan Kumar Pradhan","8260262435")
			);
	
	@Override
	public User getUser(Long id) {
		return this.list.stream().filter(u->u.getUserId().equals(id)).findAny().orElse(null);
	}
}
