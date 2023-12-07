package com.shoe.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoe.store.dto.AdminChangePasswordDto;
import com.shoe.store.dto.ShoeDto;
import com.shoe.store.dto.UserDto;
import com.shoe.store.entity.Shoe;
import com.shoe.store.entity.UserClass;
import com.shoe.store.service.StoreService;
import com.shoe.store.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/getAllUsers")
	public List<UserClass> getAllUSers(@RequestBody UserClass admin)

	{
		return userService.getAllUsers(admin);
	}

	@PostMapping("/searchUser")
	public UserClass getUserBySearch(@RequestBody UserDto userdto) {

		return userService.getSearchUser(userdto.getUserclass(), userdto.getSerachUsername());
	}

	@PostMapping("/adminChangePassword")
	public ResponseEntity<String> adminChangePassword(@RequestBody AdminChangePasswordDto adminChangePasswordDto) {
		userService.adminChangePassword(adminChangePasswordDto);
		return ResponseEntity.ok("password changed successfully");
	}

	@PostMapping("/getAllShoeByCategory")
	public List<Shoe> adminChangePassword(@RequestBody ShoeDto shoeDto) {

		return userService.getAllShoeByCategory(shoeDto);
	}

}
