/*
 *	Author: Ryan King
 *  Date: 9/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, traveler! What is thine name?");
		String name = sc.nextLine();
		System.out.println("Ah, " + name + ", what is your title? (Ex. Slayer of Dragons)");
		String title = sc.nextLine();
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
			System.out.println("It appears as if you're confused, traveler. Fear not, for all you need input is your choice of Wizard, Warrior, or a Rogue! Rerun the code.");
		}
		System.out.println("");
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.println("Strength: Buffed damage and larger inventory");
		System.out.println("Dexterity: Boosted agility and speed");
		System.out.println("Intelligence: Improved usage of magic spells");
		System.out.println("Charisma: Increased charm");
		
		System.out.println("");
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		if(strength <= 10 && strength >= 0){
			System.out.println("You have " + (20 - strength) + " left to spend.");
		}
		else if(strength > 10){
			System.out.print("Please enter a smaller value. Strength (1-10): ");
				strength = sc.nextInt();
			if(strength <= 10 && strength >= 0){
				System.out.println("You have " + (20 - strength) + " left to spend.");
			}
			else{
				System.out.println("Why bother following my rules, " + name + "? Rerun the code.");
			}
		}
		else if(strength < 0){
			System.out.println("Please enter a larger value. Strength (1-10): ");
				strength = sc.nextInt();
			if(strength <= 10 && strength >= 0){
				System.out.println("You have " + (20 - strength) + " left to spend.");
			}
			else{
				System.out.println("Why bother following my rules, " + name + "? Rerun the code.");
			}
		}
		
		System.out.println("");
		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		if(dexterity <= (20 - strength) && dexterity <= 10 && dexterity >= 0){
			System.out.println("You have " + (20 - strength - dexterity) + " left to spend.");
		}
		else if(dexterity > 10){
			System.out.print("Please enter a smaller value. Dexterity (1-10): ");
				dexterity = sc.nextInt();
			if(dexterity <= (20 - strength) && dexterity <= 10 && dexterity >= 0){
				System.out.println("You have " + (20 - strength - dexterity) + " left to spend.");
			}
			else{
				System.out.println("Why bother following my rules, " + name + "? Rerun the code.");
			}
		}
		else if(dexterity < 0){
			System.out.println("Please enter a larger value. Dexterity (1-10): ");
				dexterity = sc.nextInt();
			if(dexterity <= (20 - strength) && dexterity <= 10 && dexterity >= 0){
				System.out.println("You have " + (20 - strength - dexterity) + " left to spend.");
			}
			else{
				System.out.println("Why bother following my rules, " + name + "? Rerun the code.");
			}
		}
		
		System.out.println("");
		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		if(20 - strength - dexterity == 0){
			System.out.println("It appears you have nothing left to spend, traveler.");
			intelligence = 0;
		}
		else if(intelligence > (20 - strength - dexterity)){
			System.out.print("Unfortunately, you have too little left to spend, traveler. Please enter a smaller value. Intelligence (1-10): ");
				intelligence = sc.nextInt();
			if(intelligence <= (20 - strength - dexterity) && intelligence <= 10 && intelligence >= 0){
				System.out.println("You have " + (20 - strength - dexterity - intelligence) + " left to spend.");
			}
			else{
				System.out.println("Why bother following my rules, " + name + "? Rerun the code.");	
			}
		}
		else if(intelligence <= (20 - strength - dexterity) && intelligence <= 10 && intelligence >= 0){
			System.out.println("You have " + (20 - strength - dexterity - intelligence) + " left to spend.");
		}
		else if(intelligence > 10){
			System.out.print("Please enter a smaller value. Intelligence (1-10): ");
				intelligence = sc.nextInt();
			if(intelligence <= (20 - strength - dexterity) && intelligence <= 10 && intelligence >= 0){
				System.out.println("You have " + (20 - strength - dexterity - intelligence) + " left to spend.");
			}
			else{
				System.out.println("Why bother following my rules, " + name + "? Rerun the code.");
			}
		}
		else if(intelligence < 0){
			System.out.println("Please enter a larger value. Intelligence (1-10): ");
				intelligence = sc.nextInt();
			if(intelligence <= (20 - strength - dexterity) && intelligence <= 10 && intelligence >= 0){
				System.out.println("You have " + (20 - strength - dexterity - intelligence) + " left to spend.");
			}
			else{
				System.out.println("Why bother following my rules, " + name + "? Rerun the code.");
			}
		}
		
		System.out.println("");
		System.out.print("Charisma (1-10): ");
		int rizz = sc.nextInt();
		if((20 - strength - dexterity == 0) || (20 - strength - dexterity - intelligence == 0)){
			System.out.println("It appears you have nothing left to spend, traveler.");
			rizz = 0;
		}
		else if(rizz > (20 - strength - dexterity - intelligence)){
			System.out.print("Unfortunately, you have too little left to spend, traveler. Please enter a smaller value. Charisma (1-10): ");
				rizz = sc.nextInt();
			if(rizz <= (20 - strength - dexterity - intelligence) && rizz <= 10 && rizz >= 0){
				System.out.println("You have " + (20 - strength - dexterity - intelligence) + " left to spend.");
			}
			else{
				System.out.println("Why bother following my rules, " + name + "? Rerun the code.");	
			}
		}
		else if(rizz <= (20 - strength - dexterity - intelligence) && rizz <= 10 && rizz >= 0){
			System.out.println("You have " + (20 - strength - dexterity - intelligence - rizz) + " to spend for next time.");
		}
		else if(rizz > 10){
			System.out.print("Please enter a smaller value. Dexterity (1-10): ");
				rizz = sc.nextInt();
			if(rizz <= (20 - strength - dexterity - intelligence) && rizz <= 10 && rizz >= 0){
				System.out.println("You have " + (20 - strength - dexterity - intelligence - rizz) + " to spend for next time.");
			}
			else{
				System.out.println("Why bother following my rules, " + name + "? Rerun the code.");
			}
		}
		else if(rizz < 0){
			System.out.println("Please enter a larger value. Strength (1-10): ");
				rizz = sc.nextInt();
			if(rizz <= (20 - strength - dexterity - intelligence) && rizz <= 10 && rizz >= 0){
				System.out.println("You have " + (20 - strength - dexterity - intelligence - rizz) + " to spend for next time.");
			}
			else{
				System.out.println("Why bother following my rules, " + name + "? Rerun the code.");
			}
		}
		
		System.out.println("------------------------------------------------------------");
		System.out.println("You are " + name + ", a " + choice + " and the " + title + " of CVHS!");
		System.out.println("You're a help with the following stats!");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Charisma - " + rizz);
		
		System.out.println("");
		System.out.print("Good luck on your quest, " + name + "!");
	}
}