package com.phonbook.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phonebook.binding.UserDto;

import in.phonebook.service.UserService;

@RestController
@RequestMapping("/users")
public class UserRestController {

	@Autowired
	private UserService service;
	
	@PostMapping("/create")
	public ResponseEntity<UserDto> saveUsers(@RequestBody UserDto user){
		UserDto saveUser = service.saveUser(user);
		return new ResponseEntity<>(saveUser,HttpStatus.CREATED);
	}

}
