/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random() * 1001) + 1;
		System.out.println("Pick a number between 1 - 1000");
		int guess = sc.nextInt();
		if(answer == guess){
			System.out.println("That's right, " + answer + " was the answer!");
		}
		else if(guess > answer) {
			System.out.println("Your number was bigger than the number. The number was " + answer);
		}
		else if (guess < answer) {
			System.out.println("Your number was smaller than the number. The number was " + answer);
		}
	}
}
