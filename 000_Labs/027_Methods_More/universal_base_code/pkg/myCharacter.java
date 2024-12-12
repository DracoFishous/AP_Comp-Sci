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
	
	public myCharacter(){
		role = new String("No Role");
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	
	public myCharacter(String brian, int caleb, int siena, int kobe, int elijah){
		role = brian;
		strength = caleb;
		dexterity = siena;
		intelligence = kobe;
		charisma = elijah;
		
		if(caleb > 0)
			strength = caleb;
		else
			strength = 0;
			
		if(siena > 0)
			dexterity = siena;
		else
			dexterity = 0;
			
		if(kobe > 0)
			intelligence = kobe;
		else
			intelligence = 0;
			
		if(elijah > 0)
			charisma = elijah;
		else
			charisma = 0;
	} 

	public String setRole(String a){
		if(a.equals("Wizard") || a.equals("wizard")){
			role = "Wizard";
			return role;
		}
		else if(a.equals("Warrior") || a.equals("warrior")){
			role = "Warrior";
			return role;
		}
		else if(a.equals("Rogue") || a.equals("rogue")){
			role = "Rogue";
			return role;
		}
		else{
			role = "No Role";
			return role;
		}
	}
	
	public int setStrength(int caleb){
		if(caleb > 0){
			strength = caleb;
			return strength;
		}
		else{
			strength = 0;
			return strength;
		}
	} 
	
	public int setDexterity(int siena){
		if(siena > 0){
			dexterity = siena;
			return dexterity;
		}
		else{
			dexterity = 0;
			return dexterity;
		}
	}
	
	public int setIntelligence(int kobe){
		if(kobe > 0){
			intelligence = kobe;
			return intelligence;
		}
		else{
			intelligence = 0;
			return intelligence;
		}
	}
	
	public int setCharisma(int elijah){
		if(elijah > 0){
			charisma = elijah;
			return charisma;
		}
		else{
			charisma = 0;
			return charisma;
		}
	}
	
	public boolean setAll(String role, int strength, int dexterity, int intelligence, int charisma){
		return true;
	}
	
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.println("Your charisma trait is " + charisma);
	}
		
}
