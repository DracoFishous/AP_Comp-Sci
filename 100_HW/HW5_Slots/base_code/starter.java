/*
 *	Author:Ryan King
 *  Date: 10/5
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Slot Machine Rules:");
	System.out.println("1. Each player starts with $100.");
	System.out.println("2. Input a wager less than your total amount of money.");
	System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
	System.out.println("  a. If two numbers match, you double your money.");
	System.out.println("  b. If three numbers match, you triple your money.");
	System.out.println("  c. If none match, you lose your money.");
	System.out.println("--------------------------------------------------");
	System.out.println("");	
	int total = 100;

while(true){
		
	System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
	String answer = sc.nextLine();
	while(true){
		if(answer.equals("Yes") || answer.equals("yes") || answer.equals("Y") || answer.equals("y")){
			System.out.print("You have $" + total + ". How much would you like to wager? ");
			break;
		}
		else if(answer.equals("No") || answer.equals("no") || answer.equals("N") || answer.equals("n")){
			System.out.print("Sad to see you go! You still have $" + total + " left. Come again soon! Thanks!");
			return;
		}
		else{
			System.out.print("It seems as if you're confused. Had a bit much to drink, have we? Would you like to play the slots? (Yes/yes/Y/y): ");
			answer = sc.nextLine();
		}
	}
	
	int wager = sc.nextInt();
	sc.nextLine();
	while(true){
		if(wager > 0 && wager <= total){
			System.out.println("");
			System.out.println("Great! Let's go gambling !!");
			break;
		}
		else if(wager <= 0){
			System.out.println("Not so fast! No negatives or 0!");
			System.out.print("Please enter an appropriate wager: ");
			wager = sc.nextInt();
		}
		else if(wager > total){
			System.out.print("You only have $" + total + "! Please enter a smaller wager: ");
			wager = sc.nextInt();
		}
		else{
			System.out.print("It seems as if you're confused. Had a bit much to drink, have we?");
		}
	}
	
	total = total - wager;
	
	System.out.println("Your rolls are:");
	System.out.println("");
	System.out.println("-----------------");
	int slot1 = (int)(Math.random() * 11);
	int slot2 = (int)(Math.random() * 11);
	int slot3 = (int)(Math.random() * 11);
	System.out.println(" | " + slot1 + " | " + slot2 + " | " + slot3 + " | ");
	System.out.println("-----------------");
	System.out.println("");
	
	if(slot1 == slot2 && slot2 == slot3 && slot1 == slot3){
		System.out.println("Jackpot! Your wager has now been tripled!");
		total = total + wager * 3;
		System.out.println("You now have $" + total);
		System.out.println("");
		System.out.println("--------------------------------------------------");
		System.out.println("");
	}
	else if(slot1 == slot2 || slot2 == slot3 || slot1 == slot3){
		System.out.println("You won! Your wager has now been doubled!");
		total = total + wager * 2;
		System.out.println("You now have $" + total);
		System.out.println("--------------------------------------------------");
		System.out.println("");
	}
	else if(slot1 != slot2 && slot2 != slot3 && slot1 != slot3){
		System.out.println("Didn't win this time, better luck next time!");
		System.out.println("You now have $" + total);
		System.out.println("--------------------------------------------------");
		System.out.println("");
			if(total == 0){
				System.out.println("You've run out of money! Thanks for coming! Come back soon!");
				break;
			}
	}
	
}
	
	}
}
