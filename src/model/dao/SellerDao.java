package model.dao;

import java.util.List;

import model.entities.Seller;


public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller obj);
	void daleteById(Seller obj);
	Seller findById(Integer obj);
	List<Seller> findAll();
	
}