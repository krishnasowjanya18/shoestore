package com.shoe.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoe.store.entity.Shoe;
import com.shoe.store.repository.ShoeRepository;

@Service
public class StoreService {
	
	@Autowired
	private ShoeRepository shoeRepository;
	
	public List<Shoe> getAllShoes()
	{
	return shoeRepository.findAll();
	}
	public Shoe getShoebyID(int id)
	{
		return shoeRepository.getById(id);
	}
	public void insertShoe(Shoe shoe)
	{
		if(shoe!=null)
		{
			shoeRepository.save(shoe);
		}
	}
	public void insertShoesList(List<Shoe> shoes)
	{
		if(shoes!=null)
		{
			shoeRepository.saveAll(shoes);
		}
	}
	

}
