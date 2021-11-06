package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSucessDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String SellerName;
	private Long visited;
	private Long dealds;
	
	public SaleSucessDTO() {
	}
	
	public SaleSucessDTO(Seller seller, Long visited, Long dealds) {
		SellerName = seller.getName();
		this.visited = visited;
		this.dealds = dealds;
	}

	public String getSellerName() {
		return SellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDealds() {
		return dealds;
	}

	public void setDealds(Long dealds) {
		this.dealds = dealds;
	}
	
	
}
