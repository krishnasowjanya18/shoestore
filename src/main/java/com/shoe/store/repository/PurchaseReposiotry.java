package com.shoe.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shoe.store.entity.Purchase;

@Repository
public interface PurchaseReposiotry extends JpaRepository<Purchase, Integer> {

	@Query(value = "select p from Purchase p left outer join Shoe s on p.id=s.id where s.size=:size")
	List<Purchase> findAllByCategory(int size);

}
