package com.shoe.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoe.store.dto.AdminChangePasswordDto;
import com.shoe.store.dto.ShoeDto;
import com.shoe.store.entity.Shoe;
import com.shoe.store.entity.UserClass;
import com.shoe.store.repository.ShoeRepository;
import com.shoe.store.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ShoeRepository storeRepository;

	public List<UserClass> getAllUsers(UserClass admin)

	{
		UserClass user = userRepository.getAdmin("admin");
		if (admin.getUsername().equalsIgnoreCase("admin") && admin.getPassword().equalsIgnoreCase(user.getPassword()))
			return userRepository.findAll();
		return null;
	}

	public void saveUSer(UserClass user)

	{
		if (user != null)
			userRepository.save(user);
	}

	public UserClass getSearchUser(UserClass admin, String searchUser) {
		// TODO Auto-generated method stub
		UserClass user = userRepository.getAdmin("admin");
		if (admin.getUsername().equalsIgnoreCase("admin") && admin.getPassword().equalsIgnoreCase(user.getPassword()))
			return userRepository.searchUser(searchUser);
		return null;
	}

	public void adminChangePassword(AdminChangePasswordDto adminChangePasswordDto) {
		UserClass user = userRepository.getAdmin("admin");
		if (adminChangePasswordDto.getUserclass().getUsername().equalsIgnoreCase("admin") && adminChangePasswordDto.getUserclass().getPassword().equalsIgnoreCase(user.getPassword()))
			userRepository.adminChangePassword("admin",adminChangePasswordDto.getNewPassword());
	}

	public List<Shoe> getAllShoeByCategory(ShoeDto shoeDto) {
		UserClass user = userRepository.getAdmin("admin");
		if (shoeDto.getUser().getUsername().equalsIgnoreCase("admin") && shoeDto.getUser().getPassword().equalsIgnoreCase(user.getPassword()))
			if(shoeDto.getShoe().getSize()!=0)
			return userRepository.getShoesBySize(shoeDto.getShoe().getSize());
		return null;
	}

}
