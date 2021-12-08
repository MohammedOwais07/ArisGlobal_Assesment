package com;

public class conditionalstmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String addr="Delhi,India";
		if (addr.endsWith("India")) {
			if(addr.contains("Meerut")) {
				System.out.println("Your city is meerut");
			}
			else if(addr.contains("Noida")) {
				System.out.println("Your city is noida");
			}
			else {
				System.out.println(addr.split(",")[0] +" "+ addr.split(",")[1]);
			}
		}
		else {
			System.out.println("You r not living in india");
		}
		
		//***************************************
		
		int num=3;
		switch(num) {
		case 1: 
		      System.out.println("case 1 ");
		      break;
		      
		case 2:
			 System.out.println("case 2 ");
		      break;
		default :
			System.out.println("Not found");
			break;
			
		}
		
			
		String[] names= {"java","Python", "Python"};
		for(String name:names) {
			System.out.println(name);
		}
		
		
		
			
		}
	}


