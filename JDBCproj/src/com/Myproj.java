package com;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.*;

public class Myproj {


public void insert_autor() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String connectionString="jdbc:mysql://localhost:3306/author?characterEncoding=utf8";
		String userName="root";
		String password="Root@123";
		java.sql.Connection con=java.sql.DriverManager.getConnection(connectionString, userName, password);
		if(con!=null) {
			System.out.println("connected");
			
			Statement stmt=con.createStatement();
			Scanner sc=new Scanner(System.in);
			
			int id;
			String author_name;
			int phno;
			int isbn;
			String book_name;
			
			System.out.print("Enter the author_id : ");
            id=sc.nextInt();
            
            System.out.print("Enter author name : ");
            sc.nextLine();
            author_name = sc.nextLine();
            
            System.out.print("Enter author phno : ");
            phno=sc.nextInt();
			
            System.out.print("Enter book isbn : ");
            isbn=sc.nextInt();
            
            System.out.print("Enter book_name : ");
            sc.nextLine();
            book_name=sc.nextLine();
            sc.close();
            String query="insert into author values("+id+","+phno+",'"+author_name+"')";
            String query_book="insert into book values("+id+","+isbn+",'"+book_name+"')";
            
			
			stmt.execute(query);
			stmt.execute(query_book);
			con.close();
		}
		else {
			System.out.println("Not connected");
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}


public void query() {
	String author_name;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the author_name to display list of book : ");
	author_name=sc.nextLine();
try {
Class.forName("com.mysql.cj.jdbc.Driver");
String connectionString="jdbc:mysql://localhost:3306/author?characterEncoding=utf8";
String userName="root";
String password="Root@123";
java.sql.Connection con=java.sql.DriverManager.getConnection(connectionString, userName, password);
if(con!=null) {
	System.out.println("connected");
	
	Statement stmt=con.createStatement();
	String demoquery="select book_name from book where author_id in (select author_id from author where author_name ='"+author_name+"')";
	
	//String query="select * from author";
	ResultSet rs=stmt.executeQuery(demoquery);
	while(rs.next()) {
		System.out.println("author_id "+" : "+rs.getString(1));
		//System.out.println("phno "+" : "+rs.getInt(2));
		//System.out.println("author_name "+" : "+rs.getString(3));
		
		System.out.println("****************");
	}
  
	

	con.close();
}
else {
	System.out.println("Not connected");
}
}
catch(Exception e) {
e.printStackTrace();
}
	
}
	
	public static void main(String[] args) {
		Myproj p= new Myproj();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to display List of book by specific author");
		System.out.println("Enter 2 to insert author and book details into db");
		int user_input=sc.nextInt();
		
		switch(user_input) {
		case 1 :
			        p.query();
			        break;
		case 2:
			      p.insert_autor();
			      break;
		}
}

}
