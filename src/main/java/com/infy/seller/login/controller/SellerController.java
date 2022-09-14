package com.infy.seller.login.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.seller.login.entity.*;
import com.infy.seller.login.service.*;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@PostMapping("/")
	public Seller saveSeller(@RequestBody Seller seller) {
		return sellerService.saveSeller(seller);
	}
	
	
	@GetMapping("/")
	public List<Seller> getSeller() {
		return sellerService.getSeller();
	}
	
	
	@GetMapping("/{id}")
	public Seller getSellerById(@PathVariable("id") Long userId) {
		
		return sellerService.getSellerById(userId);
	}
	
	@GetMapping("login/{sellerName}")
	public Seller getSellerByName(@PathVariable("sellerName") String sellerName) {
		System.out.println(sellerName);
		
		return sellerService.getSellerByName(sellerName);
	}
	
	
	@PutMapping("/{id}")
	public Seller updateSellerById(@PathVariable("id") Long sellerId, @RequestBody Seller seller) {
		
		return sellerService.updateSellerById(sellerId , seller);
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteSellerById(@PathVariable("id") Long sellerId) {
		return sellerService.deleteSellerById(sellerId);
	}

}
