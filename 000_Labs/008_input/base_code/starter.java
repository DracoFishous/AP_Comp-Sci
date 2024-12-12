/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your first name?");
		String name = sc.nextLine();

		System.out.println("Woah, " + name + " is my dog's maiden name.");
		System.out.println("What is your age?");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("That's " + (16 - age) + " year(s) until you can get your permit.");
		System.out.println("What month were you born?");
		String month = sc.nextLine();
		System.out.println("Woah, " + month + " is when I had my wedding.");
		System.out.println("What day were you born?");
		int day = sc.nextInt();
		sc.nextLine();
		System.out.println("Wait, " + day + " is my favorite number.");
		System.out.println("What year were you born?");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("That's " + (year - 1279) + " years since the Song Dynasty.");
		System.out.println("How much is a buck fifty?");
		double buck = sc.nextDouble();
		System.out.print("That's $" + (700 - buck) + " until you can afford a PS5 Pro.");
	}
}
