package com;

public class testaddess{
	
	
	int id;
	String name;
	address addr;
	
  testaddess (int id, String name, address addr){
		this.id=id;
		this.name=name;
		this.addr=addr;
	}
  void display() {
	  System.out.println(id+" "+name);
	  addr.display();
	  
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		address add1=new address("kollegal", "karnataka");// because of static country var we should not include  country name here
		
		testaddess t1=new testaddess(1, "Mohammed", add1);
		t1.display();
		
		
	}

}
