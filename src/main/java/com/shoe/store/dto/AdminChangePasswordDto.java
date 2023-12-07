package com.shoe.store.dto;

import com.shoe.store.entity.UserClass;

public class AdminChangePasswordDto {

	private UserClass userclass;
	private String newPassword;

	public AdminChangePasswordDto() {
		super();
	}

	public AdminChangePasswordDto(UserClass userclass, String newPassword) {
		super();
		this.userclass = userclass;
		this.newPassword = newPassword;
	}

	public UserClass getUserclass() {
		return userclass;
	}

	public void setUserclass(UserClass userclass) {
		this.userclass = userclass;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
