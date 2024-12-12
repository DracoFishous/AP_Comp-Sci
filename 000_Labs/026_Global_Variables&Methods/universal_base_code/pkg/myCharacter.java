/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	
	public void myCharacter(){
		role = new String("No Role");
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}

	public String getRole(){
		return role;
	}

	public int getStrength(){
		return strength;
	}
	
	public int getDexterity(){
		return dexterity;
	}
	
	public int getIntelligence(){
		return intelligence;
	}
	
	public int getCharisma(){
		return charisma;
	}
/*
	public myCharacter(String a){
		if(a.equals("Wizard") || a.equals("wizard")){
			role = "Wizard";
		}
		else if(a.equals("Warrior") || a.equals("warrior")){
			role = "Warrior";
		}
		else if(a.equals("Rogue") || a.equals("rogue")){
			role = "Rogue";
		}
		else{
			role = "No Role";
		}
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
*/
		
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.println("Your charisma trait is " + charisma);
	}
		
}

