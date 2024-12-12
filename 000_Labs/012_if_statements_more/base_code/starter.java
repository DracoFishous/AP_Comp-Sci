/*
 *	Author:  Ryan King
 *  Date: 9/21
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int x = sc.nextInt();
		System.out.println("Please enter another integer: ");
		int y = sc.nextInt();
		if(x != y){
			System.out.println("Woah, you must've chosen different integers!");
		}
		else{
			System.out.println("Woah, you must've chosen the same integers!");
		}
	}
}
