package com.shoe.store.dto;

import com.shoe.store.entity.Shoe;
import com.shoe.store.entity.UserClass;

public class ShoeDto {

	private UserClass user;
	private Shoe shoe;

	public ShoeDto() {
		super();
	}

	public ShoeDto(UserClass user, Shoe shoe) {
		super();
		this.user = user;
		this.shoe = shoe;
	}

	public UserClass getUser() {
		return user;
	}

	public void setUser(UserClass user) {
		this.user = user;
	}

	public Shoe getShoe() {
		return shoe;
	}

	public void setShoe(Shoe shoe) {
		this.shoe = shoe;
	}

}
