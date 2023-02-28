package com.ydh.AuthExample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ydh.AuthExample.model.entity.UserEntity;
import com.ydh.AuthExample.model.repository.UserRepository;
import com.ydh.AuthExample.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<UserEntity> usetList() {
		return userRepository.findAll();
	}

	@Override
	public UserEntity userSave(UserEntity user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public UserEntity userFindById(String id) {
		// TODO Auto-generated method stub

		return null;
	}

}
