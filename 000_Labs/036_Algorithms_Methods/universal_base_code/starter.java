/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int [100];
		for(int c = 0; c < arr.length; c++){
			arr[c] = (int)(Math.random() * 100) + 1;
		}
		
		toStringArray(arr);
		getArrayAverage(arr);
		getArrayMax(arr);
		getArrayMin(arr);
	}
	
	public static void toStringArray(int[] arr){
		for(int c = 0; c < arr.length; c++)
		   System.out.println(arr[c]);
	}

	public static double getArrayAverage(int[] arr){
		int total = 0;
		int average = 0;
		int c = 0;
		for(c = 0; c < arr.length; c++){
			total = total + arr[c];
		}
		average = total / c;
		return average;
	}
	
	public static int getArrayMax(int[] arr){
		int max = 0;
		for(int c = 0; c < arr.length; c++){
			if(arr[c] > max){
				max = arr[c];
			}
		}
		return max;
	}
	
	public static int getArrayMin(int[] arr){
		int min = arr[0];
		for(int c = 0; c < arr.length; c++){
			if(arr[c] < min){
				min = arr[c];
			}
		}
		return min;
	}
}
