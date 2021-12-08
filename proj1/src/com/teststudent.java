package com;

public class teststudent {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student();
	     s1.insert(550545, "Mohammed", 50000);
	     s1.display();
	     s1.checkbalance();
	     s1.deposit(1000);
	     s1.checkbalance();
	     s1.withdrawl(20000);
	     s1.checkbalance();
		
	} 
}
