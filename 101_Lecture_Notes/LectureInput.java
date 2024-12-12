/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + ".");
        
        System.out.println("Please enter a number: ");
        int number1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Woah, " + number1 + " is my favorite number.");
        
        System.out.println("Please enter another number: ");
        int number2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Woah, " + number2 + " is my second favorite number.");
        
        System.out.println("The sum of these numbers are " + (number1 + number2)); //parenthesis add the two together instead of concatenation
        
        System.out.println("Please enter your favorite food");
        String food = sc.nextLine();
        System.out.print("Woah, " + food + " is also my favorite food");
    }
}