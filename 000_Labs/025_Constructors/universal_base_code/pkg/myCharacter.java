/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String choice;
	public myCharacter(){ //the name of constructor and class is the same
		choice = "No Role";
	}
	public myCharacter(String a){
		if(a.equals("Wizard") || a.equals("wizard")){
			choice = "Wizard";
			System.out.println("You've chosen the Wizard! Expelliarmus!");
		}
		else if(a.equals("Warrior") || a.equals("warrior")){
			choice = "Warrior";
			System.out.println("You've chosen the Warrior! For glory!");
		}
		else if(a.equals("Rogue") || a.equals("rogue")){
			System.out.println("You've chosen the Rogue! How daring!");
			choice = "Rogue";
		}
		else{
			System.out.println("You have not chosen an applicable role.");
			choice = "No Role";
		}
	}

}

