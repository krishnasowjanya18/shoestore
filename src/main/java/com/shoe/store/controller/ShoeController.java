package com.shoe.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoe.store.entity.Shoe;
import com.shoe.store.service.StoreService;

@RestController
public class ShoeController {
	@Autowired
	private StoreService storeService;

	@GetMapping("/getAllShoes")
	public List<Shoe> getAllShoes() {
		return storeService.getAllShoes();
	}
	
	@PostMapping("/saveShoe")
	public ResponseEntity<String> saveShoe(@RequestBody Shoe shoe)
	{
		storeService.insertShoe(shoe);
		return ResponseEntity.ok("Shoe is save successfully");
	}

}
