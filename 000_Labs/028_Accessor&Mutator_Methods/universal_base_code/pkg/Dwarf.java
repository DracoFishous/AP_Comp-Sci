/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dwarf{
	String name;
	int age;
	
	public Dwarf(){
		name = "";
		age = 0;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String a){
		name = a;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int a){
		age = a;
	}

	public void dwarfToString(){
		System.out.println(name);
		System.out.println(age);
		System.out.println();
	}
	
	
	
}
		



