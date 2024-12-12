/*
 *	Author:  Ryan King
 *  Date: 10/2/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Guess a number (0 - 1000): ");
		int guess = sc.nextInt();
		int secret = (int)(Math.random() * 1001);
		
		while(guess != secret){
			if(guess < secret){
			System.out.println("You're a little too low!");
			System.out.println("");
			System.out.print("Guess a number: ");
			guess = sc.nextInt();
				if(guess == secret){
					break;
				}
			}
			if(guess > secret){
			System.out.println("You're a little too high!");
			System.out.println("");
			System.out.print("Guess a number: ");
			guess = sc.nextInt();
				if(guess == secret){
					break;
				}
			}
		}
		
		System.out.print("You guessed it!");

	}
}
