package com.shoe.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoe.store.entity.Shoe;

@Repository
public interface ShoeRepository extends JpaRepository<Shoe, Integer> {	

}
