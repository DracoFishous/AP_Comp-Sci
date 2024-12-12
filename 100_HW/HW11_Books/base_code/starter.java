/*
 *	Author:
 *  Date:
*/

import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
		String textFile = sc.nextLine();		// This is one of the files in the 'books' folder. It MUST exist.
		String[] arr = fillArray(textFile);		// Uses the fillArray method that has been built below. This fills the array 'arr' with each word individually in the text file.
		System.out.println();


		/*
			The only time you should use Scanner with (System.in) is within the 'main' method.
			At no point should any other method use Scanner(System.in)
		*/
		while(true){
			System.out.println("What action would you like to take?");
			System.out.println("1. Check text file (file)");
			System.out.println("2. Print the text given (print)");
			System.out.println("3. Print the text backwards (printBack)");
			System.out.println("4. Print a certain number of words (printNum)");
			System.out.println("5. Change the text file (change)");
			System.out.println("6. Check the number of words in a text (check)");
			System.out.println("7. Most common word (common)");
			String choice = sc.nextLine();
			System.out.println();

			if(choice.equals("file"))
				System.out.println(textFile);
			
			if(choice.equals("print"))
				printsArray(arr);
				
			if(choice.equals("printBack"))
				printsArrayBack(arr);
				
			if(choice.equals("printNum")){
				System.out.println("How many words of the text would you like to print?");
				int num = sc.nextInt();
				sc.nextLine();
				printsNumber(arr, num);
			}
			
			if(choice.equals("change")){
				System.out.println("What is the file name of the text? (Ex: joe.txt)");
				textFile = sc.nextLine();
				arr = fillArray(textFile);
				System.out.println();
			}
			
			if(choice.equals("check")){
				System.out.println("What word/phrase would you like to check? ");
				String check = sc.nextLine();
				int wordCount = checksArray(arr, check);
				System.out.println("There are " + wordCount + " many '" + check + "' " + textFile);
			}
			
			if(choice.equals("common")){
				String common = mostCommon(arr);
				System.out.println("The most common word in the text is: " + common);
			}


			System.out.println("----------");
		}
	}


	/* ---------------------------------------------------------------------------------------
		The printsArray method prints the entire array given.
	*/
	public static void printsArray(String[] arr){
		for(int c = 0; c < arr.length; c++)
		System.out.print(arr[c] + " ");
		System.out.println();
	}


	/* ---------------------------------------------------------------------------------------
		The printsArrayBack method prints the entire array given in opposite order.
	*/
	public static void printsArrayBack(String[] arr){
		for(int c = arr.length - 1; c >= 0; c = c - 1)
		System.out.print(arr[c] + " ");
		System.out.println();
	}


	/* ---------------------------------------------------------------------------------------
		The printsNumber method prints "num" words out of the entire given array.
		If the number is larger than the number of words in the array, it tells the user too large and to try again.
			This should immediately end the method.
	*/
	public static void printsNumber(String[] arr, int num){
		if(num > arr.length - 1){
			System.out.println("Too large of a number. Please try again.");
		}
		else{
			System.out.println("------------------------------------Printing " + num + " Number of Words------------------------------------");
			for(int c = 0; c < num; c++){
				System.out.print(arr[c] + " ");
			}
			System.out.println();
			System.out.println("------------------------------------Printing " + num + " Number of Words------------------------------------");
		}
		System.out.println();
	}


	/* ---------------------------------------------------------------------------------------
		The checksArray method checks the given array for a given String.
		It counts the number of occurences that the given String shows up.
		The count is returned to the call.
	*/
	public static int checksArray(String[] arr, String check){
		int wordCount = 0;
		for(int c = 0; c < arr.length; c++){
			if(check.equals(arr[c])){
				wordCount++;
			}
		}
		return wordCount;
	}


	/* ---------------------------------------------------------------------------------------
		The mostCommon method finds the most common word in the given array.
		It returns the String of the most common word.
		This is a harder method but is doable!
		Do this one last!
	*/
	public static String mostCommon(String[] arr){
		int c = 0;
		String common = arr[c];
		int [] arrCount = new int[999999];
		int count = 0;
		int counterCount = arr.length;
		int helpIAmGoingInsane = 0;
		
		for(helpIAmGoingInsane = 0; helpIAmGoingInsane < arr.length - 1; helpIAmGoingInsane++){
		for(c = 0; c < arr.length; c++){
			if(arr[c + arr.length - counterCount].equals(arr[c + arr.length - counterCount + 1]) && (c < arr.length + counterCount - 1)){
				count++;
			}
			else if(arr[c + arr.length - counterCount].equals(arr[c + arr.length - counterCount])){
				count++;
			}
		}
		
		arrCount[count] = count;
		arr[count] = common;
		count = 0;
		
		counterCount = counterCount - 1; 
		}
		
		count = arrCount[arrCount.length - 1];
		common = arr[count];
		return common;	// Dummy value, delete when needed.
	}




	// ---------------------------------------------------------------------------------------
	/*
		The fillArray method returns an array filled of all of the words in a given text file (String).
		Each word is slotted into its own index in the array.
		The array length is the number of words in the text file.
		A precondition is that "String args" must be a valid .txt file stored in the "books" folder.
	*/
	public static String[] fillArray(String arg) throws FileNotFoundException {
		File text = new File("./books/" + arg);
		Scanner sc = new Scanner(text);
		int lineNumber = 0;
		while(sc.hasNext()){
			sc.next();
			lineNumber++;
		}

		String[] arr = new String[lineNumber];
		sc = new Scanner(text);
		for(int i = 0; i < lineNumber; i++){
			arr[i] = sc.next();
        }
		return arr;
	}

}
