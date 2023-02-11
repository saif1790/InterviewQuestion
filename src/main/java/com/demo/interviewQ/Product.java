package com.demo.interviewQ;

public class Product 
{

	private int id;
	private String pType;
	private String pName;
	private int pPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpType() {
		return pType;
	}
	public void setpType(String pType) {
		this.pType = pType;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public Product(int id, String pType, String pName, int pPrice) {
		super();
		this.id = id;
		this.pType = pType;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pType=" + pType + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	
	
	
}
