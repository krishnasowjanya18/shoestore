package com.shoe.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoe.store.entity.Purchase;
import com.shoe.store.entity.UserClass;
import com.shoe.store.repository.PurchaseReposiotry;
import com.shoe.store.repository.UserRepository;

@Service
public class PurchaseService {

	@Autowired
	private PurchaseReposiotry purchaseRepository;

	@Autowired
	private UserRepository userRepository;

	public List<Purchase> getAllPurchaseReports(UserClass user) {
		UserClass useradmin = userRepository.getAdmin("admin");

		if (user.getUsername().equalsIgnoreCase("admin")
				&& user.getPassword().equalsIgnoreCase(useradmin.getPassword()))
			return purchaseRepository.findAll();
		return null;
	}

	public void savePurchase(Purchase purchase) {
		purchaseRepository.save(purchase);
	}

	public List<Purchase> getAllPurchaseReportsByCategory(UserClass user, int size) {
		UserClass useradmin = userRepository.getAdmin("admin");

		if (user.getUsername().equalsIgnoreCase("admin")
				&& user.getPassword().equalsIgnoreCase(useradmin.getPassword()))
			return purchaseRepository.findAllByCategory(size);
		return null;
	}

}
