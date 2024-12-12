/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int x = (int)(Math.random() * 150) + 51;
		int [] arr = new int[x];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		double total = 0;
		for(int y = 0; y < x; y++){
			arr[y] = (int)(Math.random() * 100) + 1;
			total = total + arr[y];
			
			if(arr[y] < min){
				min = arr[y];
			}
			if(arr[y] > max){
				max = arr[y];
			}
			

		}
		
		double avg = (total / arr.length);
	
		System.out.println("The minimum is: " + min);
		System.out.println("The maximum is: " + max);
		System.out.println("The average is: " + avg);
		System.out.println("There are " + arr.length + " elements");
		
		


		
	}
}
