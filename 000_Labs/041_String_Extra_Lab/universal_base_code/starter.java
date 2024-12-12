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
		System.out.println("Please enter a sentence:");
		String sentence1 = sc.nextLine();
		String sentence2 = sentence1;
		String sentence3 = sentence1;
	
		int space = 0;
		int space2 = 0;
		int lastSpace = 0;
		String word = "";
		
		while(true){
		
			while(true){
			
				if(sentence1.indexOf(" ") == -1){
					System.out.print(word + " ");
						for(space2 = sentence2.length() - 1; space2 >= 0; space2--){
							lastSpace = space2;
							break;
						}
					break;
				}
				else{
					space = sentence1.indexOf(" ");
					word = sentence1.substring(0, space);
					sentence1 = sentence1.substring(space + 1);
				}
			
			}
			
			sentence1 = sentence3.substring(0, lastSpace);
			sentence2 = sentence1;
			space = 0;
				if(sentence2.indexOf(" ") == -1){
					break;
				}
			
		}
		
		
	


		
	}
}
