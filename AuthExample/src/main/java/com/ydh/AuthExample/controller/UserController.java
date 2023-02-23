package com.ydh.AuthExample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ydh.AuthExample.model.response.BaseResponse;

@RestController
@RequestMapping("/api")
public class UserController {

	@GetMapping("/test")
	public ResponseEntity<BaseResponse> test() {
		BaseResponse res = new BaseResponse();

		res.message = "Api running ... ";

		return new ResponseEntity<>(res, HttpStatus.OK);
	}
}
