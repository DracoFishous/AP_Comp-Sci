/*
 *	Author: Ryan King
 *  Date: 10/8
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your base number? ");
		int num1 = sc.nextInt();
		System.out.print("What is your exponent number? ");
		int num2 = sc.nextInt();
		pow(num1, num2);
		
	}
	
	public static int pow(int num1, int num2){
		int answer = 1;
		int count = 1;
		while(count <= num2){
			answer = answer * num1;
			count++;
		}
		System.out.print("Your answer is " + answer);
		return answer;
	}
	
}
