package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog{
	String name;
	int age;
	String breed;
	
	public Dog(){
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	
	public Dog(String a){
		name = a;
		age = 1;
		breed = "dog dog";
	}
	
	public Dog(String a, String b){
		name = a;
		age = 1;
		breed = b;
	}
	
	public Dog(String a, int c){
		name = a;
		age = c;
		breed = "dog dog";
	}
	
	public void setName(String a){
		name = a;
	}
	
	public void setAge(int c){
		age = c;
	}
	
	public void setBreed(String b){
		breed = b;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getBreed(){
		return breed;
	}
	
	public static boolean isSleeping(){
		return Math.random() < 0.5;
	}
	
	public void bark(){
		System.out.println(name + " barks!");
	}

}
