package com;

public class address {

	String city,state;
	static String country="India";
	address(String city, String state){
		this.city=city;
		this.state=state;
		//this.country=country;
	}
	
	  void display() {
		  
		  System.out.println(city+" "+state+"  "+country);
		  
	  }
}
