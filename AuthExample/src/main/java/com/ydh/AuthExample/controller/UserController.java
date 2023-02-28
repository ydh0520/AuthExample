package com.ydh.AuthExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ydh.AuthExample.model.entity.UserEntity;
import com.ydh.AuthExample.model.response.BaseResponse;
import com.ydh.AuthExample.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/userlist")
	public ResponseEntity<BaseResponse> userList() {
		BaseResponse res = new BaseResponse();
		
		res.data = userService.usetList();
		
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	@PostMapping("/usersave")
	public ResponseEntity<BaseResponse> userSave(@RequestBody UserEntity user) {
		BaseResponse res = new BaseResponse();

		res.data = userService.userSave(user);

		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	@GetMapping("/test")
	public ResponseEntity<BaseResponse> test() {
		BaseResponse res = new BaseResponse();

		res.message = "Api running ... ";

		return new ResponseEntity<>(res, HttpStatus.OK);
	}
}
