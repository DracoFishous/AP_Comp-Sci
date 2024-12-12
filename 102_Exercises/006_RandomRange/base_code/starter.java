/*
 *	Author: Ryan King
 *  Date: 9/16
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: ");
		int num1 = sc.nextInt();
		System.out.print("Please enter another integer, bigger than the first: ");
		int num2 = sc.nextInt();
		System.out.println("");
		System.out.println("Your range is " + num1 + " to " + num2);
		System.out.println("Here are 5 numbers generated in that range: ");
		int one = (int)(Math.random()*(num2 - num1)) + num1;
		int two = (int)(Math.random()*(num2 - num1)) + num1;
		int three = (int)(Math.random()*(num2 - num1)) + num1;
		int four = (int)(Math.random()*(num2 - num1)) + num1;
		int five = (int)(Math.random()*(num2 - num1)) + num1;
		System.out.print(one + ", " + two + ", " + three + ", " + four + ", " + five);
		
	}
}
