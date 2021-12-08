package demo;
import java.util.Scanner;
public class   {
 

	public static void main(String[] args) {
	   int balance =100000, withdraw, deposit;
	   Scanner sc = new Scanner  (System.in);
	
			System.out.println(" Choose 1 for Withdraw ");
			System.out.println(" Choose 2 for Deposit ");
			System.out.println(" Choose 3 for Check Balance");
			System.out.println(" Choose 4 for EXIT ");
			System.out.println(" Choose the operation you want to perform ");
		
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter money to be withdrawn ");
				withdraw = sc.nextInt();
				if (balance>=withdraw)
				{
					balance = balance - withdraw;
					System.out.println( " Please collect your money");
					
				}
				else {
					System.out.println("Insufficient Balance ");
				}
				System.out.println("");
				break;
			 case 2:  
                  
			        System.out.print("Enter money to be deposited:");  
			                      
			        //get deposite amount from te user  
			        deposit = sc.nextInt();  
			                      
			        //add the deposit amount to the total balanace  
			        balance = balance + deposit;  
			        System.out.println("Your Money has been successfully deposited");
			        System.out.println("");  
			        System.out.println("Remaining balance is : "+ balance);
			        break;  
			   
			  case 3:  
			        //displaying the total balance of the user  
			        System.out.println("Balance : "+balance);  
			        System.out.println("");  
			        break;  
			  
			   
			  case 4:  
			        //exit from the menu  
			        System.exit(0);  
			}
			
			
			
			sc.close();
		}
	}


