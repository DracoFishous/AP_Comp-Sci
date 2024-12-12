/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		
		int [] arr = new int[20];
		int x = (int)(Math.random() * 10) + 1;
		int y = 0;
		for(int c = 0; c < 20; c++){
			arr[c] = (int)(Math.random() * 10) + 1;
			if(arr[c] == x){
				System.out.println("There is a duplicate of " + x + " at arr[" + y + "]");
				y++;
			}

			if(c > 0 && arr[c] == arr[c - 1]){
				System.out.println("At arr[" + (c - 1) + "], there is a duplicate of " + arr[c]);
			}
		}
		

	}
}



/*1. Create an array of 20 elements.
     a. The elements should have random values between 1 and 10.
2. Find all duplicates of a random number. 
     a. Generate a random number between 1 and 10. This will be your target number
     b. Find all duplicate numbers of your target number. 
     c. Print out the index of where ALL duplicates are and print out the total number of duplicates.
3. Find if there are two consecutive numbers in a row
     a. Using the same array as above. 
     b. Find if two consecutive numbers in a row are the same. 
     c. Print their indexes and what number it was!
     */