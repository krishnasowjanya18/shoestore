package com.shoe.store.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private Date purchaseDate;
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="purchase_id")
	List<Shoe> purchasedShoes;
	public Purchase() {
		super();
	}
	public Purchase(int id, Date purchaseDate, List<Shoe> purchasedShoes) {
		super();
		this.id = id;
		this.purchaseDate = purchaseDate;
		this.purchasedShoes = purchasedShoes;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public List<Shoe> getPurchasedShoes() {
		return purchasedShoes;
	}
	public void setPurchasedShoes(List<Shoe> purchasedShoes) {
		this.purchasedShoes = purchasedShoes;
	}
	
	
	
	

}
