/*
 *	Author: Ryan King
 *  Date: 11/01/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		PooleDwarf num1 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
		PooleDwarf num2 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
		PooleDwarf num3 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
		PooleDwarf num4 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
		PooleDwarf num5 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
		PooleDwarf num6 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);
		PooleDwarf num7 = new PooleDwarf(randName(), (int)(Math.random() * 100) + 1);

		int x = 0;
		if(num1.isSameName(num2.getName())){
			x++;
		}
		
		if(num1.isSameName(num3.getName())){
			x++;
		}
		
		if(num1.isSameName(num4.getName())){
			x++;
		}
		
		if(num1.isSameName(num5.getName())){
			x++;
		}
		
		if(num1.isSameName(num6.getName())){
			x++;
		}
		
		if(num1.isSameName(num7.getName())){
			x++;
		}
		
		System.out.println(num1.getName() + " was repeated " + x + " amount of times!");
		
	}
}