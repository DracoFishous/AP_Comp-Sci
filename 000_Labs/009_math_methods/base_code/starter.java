/*
 *	Author:  Ryan King
 *  Date:  9/13
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		System.out.println(Math.max(13 - 6 * 11, 30 %  7 * (-2))); //(-53, -4)
		System.out.println(Math.sqrt(3 * 8 + 31 % 7));
		System.out.println(Math.pow(37 / 3, 35 % 21));
		System.out.println(Math.max((Math.pow(2, 14 % 3)), (Math.sqrt(2 * 6))));
		System.out.println();
		
		//Extra
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		double x = sc.nextDouble();
		System.out.println("Please enter another number:");
		double y = sc.nextDouble();
		System.out.println("The max of " + x + " and " + y + " is " + Math.max(x, y));
		System.out.println("The square root of " + y + " is " + Math.sqrt(y));
		System.out.println(x + "^" + y + " is " + Math.pow(x, y));
		
	}
}
