package com.shoe.store.dto;

import com.shoe.store.entity.UserClass;

public class UserDto {

	private UserClass userclass;
	private String serachUsername;

	public UserDto() {
		super();
	}

	public UserDto(UserClass userclass, String serachUsername) {
		super();
		this.userclass = userclass;
		this.serachUsername = serachUsername;
	}

	public UserClass getUserclass() {
		return userclass;
	}

	public void setUserclass(UserClass userclass) {
		this.userclass = userclass;
	}

	public String getSerachUsername() {
		return serachUsername;
	}

	public void setSerachUsername(String serachUsername) {
		this.serachUsername = serachUsername;
	}

}
