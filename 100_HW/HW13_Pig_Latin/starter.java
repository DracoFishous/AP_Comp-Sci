/*
   * Author: Ryan King
   * Date:
   * Collaborator(s):
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence:");
		String sentence = sc.nextLine();
		int space1 = 0;
		String word1 = "";
		
		while(true){
			space1 = sentence.indexOf(" ");
			if(space1 == -1){
				word1 = sentence.substring(0);
				if(word1.length() == 1){
    					if(doesThisWordStartWithAVowel(word1)){
    						word1 = word1 + ("-way");
    						System.out.print(word1 + " ");
    					}
    					else{
    						System.out.print(word1 + " ");
    					}
    				}
				else if(doesThisWordStartWithAConsonantAndVowel(word1)){
    					String letter1 = word1.substring(0, 1);
    					word1 = word1.substring(1);
    					System.out.print(word1 + "-" + letter1 + "ay");
    					break;
    				}
    				else if(doesThisWordStartWithTwoConsonants(word1)){
    					String letter2 = word1.substring(0, 2);
    					word1 = word1.substring(2);
    					System.out.print(word1 + "-" + letter2 + "ay");
    					break;
    				}
    				else if(doesThisWordStartWithAVowel(word1)){
    					word1 = word1 + "-way";
    					System.out.print(word1);
    					break;
    				}
    				break;
			}
			else{
				word1 = sentence.substring(0, space1);
    				if(word1.length() == 1){
    					if(doesThisWordStartWithAVowel(word1)){
    						word1 = word1 + ("-way");
    						System.out.print(word1 + " ");
    					}
    					else{
    						System.out.print(word1 + " ");
    					}
    				}
    				else{
    					if(doesThisWordStartWithAConsonantAndVowel(word1)){
    						String letter1 = word1.substring(0, 1);
    						word1 = word1.substring(1, space1);
    						System.out.print(word1 + "-" + letter1 + "ay ");
    					}
    					else if(doesThisWordStartWithTwoConsonants(word1)){
    						String letter2 = word1.substring(0, 2);
    						word1 = word1.substring(2, space1);
    						System.out.print(word1 + "-" + letter2 + "ay ");
    					}
    					else if(doesThisWordStartWithAVowel(word1)){
    						word1 = word1 + "-way";
    						System.out.print(word1 + " ");
    					}
    				}
    				sentence = sentence.substring(space1 + 1);
				}
			}
		}
	
	public static boolean doesThisWordStartWithAVowel(String word){
		String word1  = word.substring(0);
		if(word1.contains("a") || word1.contains("A") || word1.contains("e") || word1.contains("E") || word1.contains("i") || word1.contains("I") || word1.contains("o") || word1.contains("O") || word1.contains("u") || word1.contains("U") || word1.contains("y") || word1.contains("Y")){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean doesThisWordStartWithAConsonant(String word){
		if(doesThisWordStartWithAVowel(word) == false){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean doesThisWordStartWithAConsonantAndVowel(String word){
		if(doesThisWordStartWithAConsonant(word.substring(0, 1)) && doesThisWordStartWithAVowel(word.substring(1, 2))){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean doesThisWordStartWithTwoConsonants(String word){
		String word2 = word.substring(1);
		if(doesThisWordStartWithAConsonant(word) && doesThisWordStartWithAConsonant(word2)){
			return true;
		}
		else{
			return false;
		}
	}
}
