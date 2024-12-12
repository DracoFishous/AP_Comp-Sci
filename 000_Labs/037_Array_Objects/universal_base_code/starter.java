/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	
	public static void main(String args[]) {
		
		Wizard[] x = new Wizard[100];
		for(int xc = 0; xc < x.length; xc++){
			x[xc] = new Wizard();
		}
		
		Warrior[] y = new Warrior[100];
		for(int yc = 0; yc < y.length; yc++){
			y[yc] = new Warrior();
		}
		
		int c = 0;
		int w = 0;
		
		for(int b = 0; c < x.length || w < y.length; b++){
			
			if(c > x.length - 2){
				break;
			}
			else if(x[c].isDead() && c < x.length){
				x[c] = x[c + 1];
				c++;
			}
			else{
				x[c].attack(y[w]);
			}
			
			if(w > y.length - 2){
				break;
			}
			if(y[w].isDead() && w < y.length){
				y[w] = y[w + 1];
				w++;
			}
			else{
				y[w].attack(x[c]);
			}
			
		}
		
		if(x[x.length - 1].isDead())
			System.out.println("Warriors win with " + (100 - w) + " remaining!");
		else
			System.out.println("Wizards win with " + (100 - c) + " remaining!");

	}
}
