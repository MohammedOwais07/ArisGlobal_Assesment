package com;

public class student {
	int acc_no;
	String name;
	float amount;

	
	void insert(int ac, String nme, float amt) {
		acc_no=ac;
		name=nme;
  		amount=amt;
	}
	void withdrawl(float amt) {
		
		if(amount<amt) {
			
			System.out.println("insufficient balance");
		}
		else {
			amount=amount-amt;
			System.out.println(amt+"withdrawl");
		}
	}
	
	void deposit(float amt) {
		
		
			amount=amount+amt;
			System.out.println(amt+"deposited");
		
	}
	
	void checkbalance() {
		
		
		
		System.out.println("Balance is : " + amount);
	
}

	
	void display() {
		System.out.println(acc_no +"  "+name+ " "+ amount);
	}

}
