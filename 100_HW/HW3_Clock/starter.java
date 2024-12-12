/*
 *	Author: Ryan King
 *  Date: 9/16
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer corresponding with the following: ");
		System.out.println("0 = Sunday");
		System.out.println("1 = Monday");
		System.out.println("2 = Tuesday");
		System.out.println("3 = Wednesday");
		System.out.println("4 = Thursday");
		System.out.println("5 = Friday");
		System.out.println("6 = Saturday");
		int alarm = sc.nextInt();
		if(alarm > 0 && alarm < 6){
			System.out.print("Your alarm is set for 7:00am! Don't be late for work.");
		}
		else if(alarm == 0 || alarm == 6){
			System.out.print("Your alarm is set for 10:00am! Enjoy your weekend.");
		}
		else{
			System.out.print("Since when have they invented a new day of the week?");
		}
		
	}
}
