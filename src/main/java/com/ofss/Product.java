package com.ofss;

public class Product {
String productName;
double price;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}

public Product(String productName, double price) {
this.productName=productName;
this.price=price;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
