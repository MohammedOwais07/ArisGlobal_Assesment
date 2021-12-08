package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;
import com.mysql.*;



public class Myjdbc {
	
	public void delete() {
		  try {
	    	    Class.forName("com.mysql.cj.jdbc.Driver");
	    	    String connectionString="jdbc:mysql://localhost:3306/customer?characterEncoding=utf8";
	    	    String userName="root";
	    	    String password="Root@123";
	    	    Connection con=DriverManager.getConnection(connectionString,userName,password);
	    	    if(con!=null) {
	    	    	System.out.println("connected");
	    	    	Scanner sc=new Scanner(System.in);
	    	    	
	    	    	Statement stmt= con.createStatement();
	    	    	 System.out.println("Enter an id to be deleted");  
 	    		       int id=sc.nextInt();
 	    		       sc.close();
 	    		       String  deleteQuery="delete from customer where id="+id;
 	    		       stmt.executeUpdate(deleteQuery);
	    	    }
		  }
 	    		      catch(Exception e) {
 	    		    	   e.printStackTrace();
 	    		       }

	}
	
	//********************************************************************
	
	public void insert() {
		  try {
	    	    Class.forName("com.mysql.cj.jdbc.Driver");
	    	    String connectionString="jdbc:mysql://localhost:3306/customer?characterEncoding=utf8";
	    	    String userName="root";
	    	    String password="Root@123";
	    	    Connection con=DriverManager.getConnection(connectionString,userName,password);
	    	    if(con!=null) {
	    	    	System.out.println("connected");
	    	    	Scanner sc=new Scanner(System.in);
	    	    	
	    	    	Statement stmt= con.createStatement();
	    	    	 System.out.println("Enter the items to be inserted");  
	    	    	 
	    	    	 System.out.print("Enter the id : ");
	    		       int id=sc.nextInt();
	    		       
	    		       sc.nextLine();
	    		       System.out.print("Enter the name : ");
	    		       String name=sc.nextLine();
	    		       
	    		       System.out.print("Enter the age: ");
	    		       int age=sc.nextInt();
	    		       
	    		       System.out.print("Enter the addr : ");
	    		       sc.nextLine();
	    		       String addr=sc.nextLine();
	    		       
	    		       System.out.print("Enter the sal : ");
	    		       int sal = sc.nextInt();
	    		       
	    		       
	    		       sc.close();
	    		       String insetrQuery="INSERT INTO CUSTOMER(id,name,age,addr,sal) VALUES ("+id+","+name+","+age+","+addr+","+sal+")";
	    	               stmt.executeUpdate(insetrQuery);
	    		       
	    		      
	    	    }
		  }
	    		      catch(Exception e) {
	    		    	   e.printStackTrace();
	    		       }

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Myjdbc jd =new Myjdbc();
		
		
       try {
    	    Class.forName("com.mysql.cj.jdbc.Driver");
    	    String connectionString="jdbc:mysql://localhost:3306/customer?characterEncoding=utf8";
    	    String userName="root";
    	    String password="Root@123";
    	    Connection con=DriverManager.getConnection(connectionString,userName,password);
    	    if(con!=null) {
    	    	System.out.println("connected");
    	    	
    	    	Statement stmt= con.createStatement();
    	  
   	    	   Scanner sc= new Scanner(System.in);
   	    	   System.out.println("1 to delete , 2 to update , 3 to insert, 4 to display ");
   	    	   System.out.println("Ener a number");
   	    	     num=sc.nextInt();
   	    	     
   	    	    
   	    	
   	    	   switch(num) {
   	    	   
   	    	   
   	    	   case 1: jd.insert();
   	    	   
   	    		        break;
   	    		        
   	    		        
   	    		        
   	    	   case 2:   System.out.println("Enter name : "); 
   	    	               sc.nextLine();
   		                   String name=sc.nextLine();
   		                System.out.println("Enter id : "); 
   	    	             int  id=sc.nextInt();
   	    		      
   	    		      String updateQuery="update customer set name="+name+" where id="+id+"";
   	    		      stmt.executeUpdate(updateQuery);
   	    		      break;
   	    		      
   	    	   case 3:      String insetrQuery="INSERT INTO CUSTOMER(id,name,age,addr,sal) VALUES ('3','manoj','22','Delhi','1500')";
   	    	               stmt.executeUpdate(insetrQuery);
   	    	               break;
   	    	               
   	    	   case 4:     String query ="select * from customer";
   	    	ResultSet rs=stmt.executeQuery(query);
	    	
   	    	while(rs.next()) {
   	    		System.out.println("id "+rs.getInt(1));
   	    		System.out.println("name "+rs.getString(2));
   	    		System.out.println("age "+rs.getInt(3));
   	    		System.out.println("addr "+rs.getString(4));
   	    		System.out.println("sal "+rs.getInt(5));
   	    		System.out.println("******************************* ");
   	    	}       
   	    	  
   	    	   }
    	        
    	    	
    	    }
    	    else {
    	    	System.out.println("Not connected");
    	    }
    	    
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }

	}

}
