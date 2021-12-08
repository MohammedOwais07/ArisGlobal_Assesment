package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class streamdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      
      ArrayList<String> ar1=new ArrayList<String>();
      ar1.add("mohammed");
      ar1.add("owais");
      ar1.add("");
      ar1.add("sufyan");
      ar1.add("RAHAMAN");
      
     // ar1.forEach(System.out::println);
   
   //   System.out.println(ar1);
      
   /*   List<Integer> ar2=ar1//list
    		  .stream()//converted to stream
    		  .map((number)->number*number)//map
    		  .collect(Collectors.toList());//convert to list again
      
     */
      // displaying the length of each String
      
      System.out.println("length of each String : ");
      List<String> list = Arrays.asList("Mohammed", "Owais", "sufyan","Computer");

            list.stream().map(str -> str.length()).forEach(System.out::println);
            
            
   
        System.out.println("------------------------------");
       System.out.println("concat a string :");
            // concat
            String a="Hello";
            List<String> ar6=ar1.stream().map((stg)->stg.concat(a)).collect(Collectors.toList());
            ar6.forEach(System.out::println);
      
      
      System.out.println("------------------------------");
      System.out.println("ends with specific char :");
      //ends with specific char
      List<Boolean> ar4=ar1.stream().map((stg)->stg.endsWith("s")).collect(Collectors.toList());
      ar4.forEach(System.out::println);
     
      
      System.out.println("------------------------------");
      System.out.println("starts with specific char :");
      
      //starts with specific char
      List<Boolean> ar5=ar1.stream().map((stg)->stg.startsWith("s")).collect(Collectors.toList());
      ar5.forEach(System.out::println);
      
      
      
      
      System.out.println("------------------------------");
      
      System.out.println("------------------------------");
      System.out.println("using filter to count a empty : ");
  
   // using filter to count
     
     long count=ar1.stream().filter(s->s.isEmpty()).count();
     System.out.println(count);
     
     
     System.out.println("------------------------------");
     System.out.println("filter | which contains a specific char :");
    // which contains a specific char
     ar1.stream().filter(b->b.contains("w")).forEach(System.out::println);
     
     System.out.println("------------------------------");
     System.out.println("filter | to find even :");
     //to find even
     List<Integer> list4 = Arrays.asList(1, 3, 5,7,8,2);
     
      list4.stream().filter(c->c%2==0).forEach(System.out::println);
      
      
      System.out.println("------------------------------");
      System.out.println("filter | to find odd :");
      //to find odd
      List<Integer> list5 = Arrays.asList(1, 3, 5,7,8,2);
      
       list5.stream().filter(c->c%2!=0).forEach(System.out::println);
      
       
       
       
       
       /*
       
      List<Integer> lst=Arrays.asList(1,2,10,35,15,3,41);
      System.out.println(lst.stream().limit(2).collect(Collectors.toList()));
      
      */

      
}
	

	
}
