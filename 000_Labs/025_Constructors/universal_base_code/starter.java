/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter yuya = new myCharacter();
		System.out.println("Your role is " + yuya.choice);
		System.out.println("---------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or a Rogue?");
		String choice = sc.nextLine();
		myCharacter jayden = new myCharacter(choice);
		System.out.println("Your role is " + jayden.choice);


		
	}
}
