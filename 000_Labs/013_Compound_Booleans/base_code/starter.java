/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer: "); 
		int one = sc.nextInt();
	    System.out.println("Please enter another integer: "); 
	    int two = sc.nextInt();
		System.out.println("Please enter another integer: "); 
		int three = sc.nextInt();
		
	   if(one > two && one > three){
	   	System.out.println(one + " is the largest integer!");
	   }
	   else if(two > one && two > three){
	   	System.out.println(two + " is the largest integer!");
	   }
	   else if(three > one && three > two){
	   	System.out.println(three + " is the largest integer!");
	   }
	   else{
	   	System.out.println("All your integers must be equal!");
	   }
	   
	   if(one < two && one < three){
	   	System.out.println(one + " is the smallest integer!");
	   }
	   else if(two < one && two < three){
	   	System.out.println(two + " is the smallest integer!");
	   }
	   else if(three < one && three < two){
	   	System.out.println(three + " is the smallest integer!");
	   }
	}
}
