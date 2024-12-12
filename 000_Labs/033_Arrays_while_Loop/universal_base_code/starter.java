/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[1000];
		int c = 0;
		while(c < 1000){
			arr[c] = (int)(Math.random() * 1001);
			System.out.println(arr[c]);
			c++;
		}


		
	}
}
