package com.infy.seller.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.seller.login.entity.*;

public interface SellerRepository  extends JpaRepository< Seller , Long > {
	
	Seller findBySellerId(Long sellerId);
	
	Seller findBySellerEmail(String sellerEmail);

	Seller findBySellerName(String sellerName);
	
	
	
	
}
