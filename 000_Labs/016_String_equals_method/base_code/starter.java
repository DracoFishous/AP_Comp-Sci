/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or a Rogue?");
		String choice = sc.nextLine();
		if(choice.equals("Wizard") || choice.equals("wizard")){
			System.out.println("You've chosen the Wizard! Expelliarmus!");
		}
		else if(choice.equals("Warrior") || choice.equals("warrior")){
			System.out.println("You've chosen the Warrior! For glory!");
		}
		else if(choice.equals("Rogue") || choice.equals("rogue")){
			System.out.println("You've chosen the Rogue! How daring!");
		}
		else{
			System.out.println("It appears as if you're confused, traveler. Fear not, for all you need input is your choice of Wizard, Warrior, or a Rogue!");
		}
	}
}
