/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word or phrase: ");
		String sentence = sc.nextLine();
		
		while(true){
			if(sentence.indexOf(" ") == -1){
				System.out.print(spongeCase(sentence));
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			System.out.print(spongeCase(word) + " ");
			sentence = sentence.substring(space + 1);
		}
		
		/*
		int count = 0;
		String lowerX = "";
		String upperX = "";
		String expunge = "";
		
		for(count = 0; count < x.length() - 1; count+=2){
			lowerX = x.substring(count, count + 1);
			lowerX = lowerX.toLowerCase();
			upperX = x.substring(count + 1, count + 2);
			upperX = upperX.toUpperCase();
			expunge = expunge + lowerX + upperX;
		}
		
		if(x.length() % 2 != 0){
			lowerX = x.substring(count);
			lowerX = lowerX.toLowerCase();
			expunge = expunge + lowerX;
		}
		
		System.out.println("Your word/phrase as sPoNgE cAsE:");
		System.out.println(expunge);
		*/

	}
	
	public static String spongeCase(String word){
			String result = "";
			for(int i = 0; i < word.length(); i++){
				String letter = word.substring(i, i + 1);
			
				if(i % 2 == 0){
					letter = letter.toLowerCase();
				}
				else{
					letter = letter.toUpperCase();
				}
				result = result + letter;
			}
			return result;
		}
		
}
