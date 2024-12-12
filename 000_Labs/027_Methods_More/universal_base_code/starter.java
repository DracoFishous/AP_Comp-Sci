/*
 *	Author: ryan king  
 *  Date: 10/25/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter julia = new myCharacter();
		julia.myToString();
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or a Rogue?");
		String role = sc.nextLine();
		myCharacter jayden = new myCharacter(role, 1, 2, 3, 4);
			jayden.setRole(role);
	
		jayden.myToString();


		
	}
}
