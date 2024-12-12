/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter the temperature in Fahrenheit: ");
	double fanta = sc.nextDouble();
	System.out.print(fanta + "°F is " + ((fanta - 32)*5/9) + "°C");
	}
}
