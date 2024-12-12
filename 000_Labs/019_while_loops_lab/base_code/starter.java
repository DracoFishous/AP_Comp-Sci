/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a name: ");
		String name = sc.nextLine();
		System.out.print("How many times would you like this name to be repeated? ");
		int count = 0;
		int num = sc.nextInt();
		while(count < num){
			System.out.println(name);
			if(count == num){
				break;
			}
			count = count + 1;
		}



		
	}
}
