/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence!");
		String sentence1 = sc.nextLine();
		System.out.println("Write a sentence!");
		String sentence2 = sc.nextLine();
		toString(sentence1);
		toStringCombined(sentence1, sentence2);
	}
	
	public static void toString(String sentence1){
		System.out.println(sentence1);
	}
	
	public static void toStringCombined(String sentence1, String sentence2){
		String sentence = sentence1 + " " + sentence2;
		System.out.println(sentence);
	}
}
