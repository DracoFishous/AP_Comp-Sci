/*
 *	Author: Ryan King
 *  Date: 10/22
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.raiseSalary(17);
		dwight.employeeToString();
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.raiseSalary(21);
		jim.employeeToString();
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.raiseSalary(7);
		pam.employeeToString();
		
		Employee sakura = new Employee(3216, "Sakura", "Bolen", 1027.08);
		sakura.raiseSalary(2);
		sakura.employeeToString();
	
	}
}
