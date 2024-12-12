/*
 *	Author: Ryan King
 *  Date: 9/11
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Please enter a number: ");
    	int number = sc.nextInt();
    	
    	System.out.println("Here are the next 5 numbers!");
    	System.out.println(number + ", " + (number + 1) + ", " + (number + 2) + ", " + (number + 3) + ", " + (number + 4) + ", and " + (number + 5) + ".");
    	System.out.println("Here are the next 5 multiples of " + number + "!");
    	System.out.println(number + ", " + (number*2) + ", " + (number*3) + ", " + (number*4) + ", " + (number*5) + ", and " + (number*6) + ".");
    	System.out.println("Here is " + number + " divided by 100!");
    	System.out.println((number/100.0));
    	System.out.println("Here is " + number + " divided by 10!");
    	System.out.print((number/10.0));

	}
}
