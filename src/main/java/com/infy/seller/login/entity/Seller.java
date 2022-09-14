package com.infy.seller.login.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "seller")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sellerId;
	@Column(name="sellerName",unique = true)
	private String sellerName;
	@Column(unique=true)
	private String sellerEmail;
	private String sellerPassword;
	public Long getSellerId() {
		return sellerId;
	}
	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerPassword() {
		return sellerPassword;
	}
	public void setSellerPassword(String sellerPassword) {
		this.sellerPassword = sellerPassword;
	}
	public String getSellerEmail() {
		return sellerEmail;
	}
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}
	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerEmail=" + sellerEmail
				+ ", sellerPassword=" + sellerPassword + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
