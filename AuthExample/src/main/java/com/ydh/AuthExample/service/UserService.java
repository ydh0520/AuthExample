package com.ydh.AuthExample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ydh.AuthExample.model.entity.UserEntity;

@Service
public interface UserService {
	public List<UserEntity> usetList();

	public UserEntity userSave(UserEntity user);

	public UserEntity userFindById(String id);
}
