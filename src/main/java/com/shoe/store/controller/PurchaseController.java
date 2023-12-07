package com.shoe.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.shoe.store.entity.Purchase;
import com.shoe.store.entity.UserClass;
import com.shoe.store.service.PurchaseService;
import com.shoe.store.service.UserService;


@RestController
public class PurchaseController {
	
	@Autowired
	private PurchaseService purchaseService;

	@PostMapping("/getAllPurchaseReport")
	public List<Purchase> getAllPurchaseReport(@RequestBody UserClass user) {
		return purchaseService.getAllPurchaseReports(user);
	}
	@PostMapping("/savePurchase")
	public void savePurchase(@RequestBody Purchase purchase)
	{
		purchaseService.savePurchase(purchase);
	}
	
	@PostMapping("/getAllPurchaseByCategory/{size}")
	public List<Purchase> getAllPurchaseReportByCategory(@RequestBody UserClass user,@PathVariable("size") int size) {
		return purchaseService.getAllPurchaseReportsByCategory(user,size);
	}

}
