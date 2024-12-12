/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dwarf Grumpy = new Dwarf();
		Grumpy.setName("Grumpy");
		Grumpy.setAge((int)(Math.random() * 100) + 1);
		Grumpy.dwarfToString();
		
		Dwarf Dopey = new Dwarf();
		Dopey.setName("Dopey");
		Dopey.setAge((int)(Math.random() * 100) + 1);
		Dopey.dwarfToString();
		
		Dwarf Doc = new Dwarf();
		Doc.setName("Doc");
		Doc.setAge((int)(Math.random() * 100) + 1);
		Doc.dwarfToString();
		
		Dwarf Happy = new Dwarf();
		Happy.setName("Happy");
		Happy.setAge((int)(Math.random() * 100) + 1);
		Happy.dwarfToString();
		
		Dwarf Bashful = new Dwarf();
		Bashful.setName("Bashful");
		Bashful.setAge((int)(Math.random() * 100) + 1);
		Bashful.dwarfToString();
		
		Dwarf Sneezy = new Dwarf();
		Sneezy.setName("Sneezy");
		Sneezy.setAge((int)(Math.random() * 100) + 1);
		Sneezy.dwarfToString();
		
		Dwarf Sleepy = new Dwarf();
		Sleepy.setName("Sleepy");
		Sleepy.setAge((int)(Math.random() * 100) + 1);
		Sleepy.dwarfToString();


		
	}
}
