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
		for(int c = 0; c < 1000; c++){
			arr[c] = (int)(Math.random() * 1001);
			System.out.println(arr[c]);
			c++;
		}


		
	}
}
