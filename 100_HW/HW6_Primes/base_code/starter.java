/*
 *	Author: Ryan King
 *  Date: 10/12/2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int x = sc.nextInt();
		printPrimes(x);
	}
	
	public static boolean checkPrime(int x){
		int y = 2;
		while(y < x){
			if(x % y == 0){
				return false;
			}
			y++;
		}
		return true;
	}
	
	public static void printPrimes(int x){
		int y = 2;
		while(x > y){
			if(checkPrime(y)){
				System.out.println(y);
			}
			y++;
		}
	}
	
}
