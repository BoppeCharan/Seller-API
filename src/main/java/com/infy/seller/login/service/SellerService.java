package com.infy.seller.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.seller.login.entity.*;
import com.infy.seller.login.repository.SellerRepository;


@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public Seller saveSeller(Seller seller) {
		
		return sellerRepository.save(seller);
	}
	
	public List<Seller> getSeller() {
		
		return sellerRepository.findAll();
	}

	public Seller getSellerById(Long sellerId) {
		return sellerRepository.findBySellerId(sellerId);
	}

	public Seller getSellerByName(String sellerName) {
		return sellerRepository.findBySellerName(sellerName);
	}
	
	public Seller findSellerById(Long sellerId) {
		return sellerRepository.findBySellerId(sellerId);
	}

	public Seller findSellerByName(String sellerName) {
		System.out.println(sellerName);
		Seller s = sellerRepository.findBySellerEmail(sellerName);
		return s;
	}


	public Seller updateSellerById(Long sellerId, Seller seller) {
		Seller db = sellerRepository.findBySellerId(sellerId);
		
		db.setSellerName(seller.getSellerName());
		db.setSellerPassword(seller.getSellerPassword());
		return sellerRepository.save(db);
	}
	
	
	public String deleteSellerById(Long sellerId) {
		Seller db = sellerRepository.findBySellerId(sellerId);
		sellerRepository.delete(db);
		return "deleted";
	}

}
