/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word = sc.nextLine();
		System.out.println("Letter by letter: ");
		
		for(int c = 0; c < word.length(); c++){
			System.out.println(c + " " + word.substring(c, c + 1));
		}


		
	}
}
