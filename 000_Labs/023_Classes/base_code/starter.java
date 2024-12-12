/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;


class Character{
	String character = new String("Wizard");
	int strength = 5;
	int dexterity = 5;
	int intelligence = 5; 
	int rizz = 5;
}
	
class starter {
	public static void main(String args[]) {
		Character myCharacter = new Character();
		System.out.println("Your role is " + myCharacter.character);
		System.out.println("Your strength trait is " + myCharacter.strength);
		System.out.println("Your dexterity trait is " + myCharacter.dexterity);
		System.out.println("Your intelligence trait is " + myCharacter.intelligence);
		System.out.println("Your charisma trait is " + myCharacter.rizz);
	}
}
