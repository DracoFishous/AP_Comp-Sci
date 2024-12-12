/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog hoon = new Dog("Hoon", 14);
		Dog eula = new Dog("Eula", 15);
		
		boolean isHoonAsleep = hoon.isSleeping();
		if(isHoonAsleep == true)
			System.out.println("Hoon is sleeping!");
		else{
			System.out.println("Hoon is awake!");
			hoon.bark();
			}
			
		if(eula.isSleeping() && isHoonAsleep == false)
			eula.bark();
		else if(isHoonAsleep == true)
			return;
		else if(eula.isSleeping() == false && isHoonAsleep == false)
			eula.bark();
		

	}
}
