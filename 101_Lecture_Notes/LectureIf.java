/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("You've joined an Alien Exchange Program!");
       System.out.println("Pick an Alien to take in!");
       System.out.println("1. Tara Quinn: An adventurous Earth scientist with a knack for innovation and boundless curiosity.");
       System.out.println("2. Luminara: A graceful Aelorian ambassador with a glowing aura reflecting her wisdom.");
       System.out.println("3. Zarok: A pragmatic Talaran engineer known for his problem-solving skills and quiet confidence.");
       
       int answer1 = sc.nextInt();
       if(answer1 == 1){
           System.out.println("You picked Tara Quinn!");
           System.out.println("");
           System.out.println("You receive a shimmering, alien envelope with an invitation to the Intergalactic Exchange Program, offering a mission to explore Veridion's advanced botanical technologies:");
           System.out.println("1. Accept the Invitation: Embrace the opportunity and prepare for your journey to Veridion.");
           System.out.println("2. Seek More Information: Visit the Intergalactic Exchange Program office to gather more details before making your decision.");
           System.out.println("3. Decline the Invitation: Opt out and continue your routine, wondering about the missed chance.");
            int answer2 = sc.nextInt();
            if(answer2 == 1){
                System.out.println("You accepted the invitation and are on your way to Veridion!");
            }
            else if(answer2 == 2){
                System.out.println("You decided to visit the Intergalactic Exchange Program Office.");
            }
            else if(answer2 == 3){
                System.out.println("You declined the invitation and continue your routine.");
            }
            else{
                System.out.println("You die a very painful death due to your inaction.");
            }
       }
       else if(answer1 == 2){
           System.out.println("You picked Luminara!");
           System.out.println("");
           System.out.println("While working at your lab, an alien craft lands outside, and Luminara, an elegant Aelorian ambassador, approaches with an offer to join the Intergalactic Exchange Program and learn about Aelorian culture and technology:");
           System.out.println("1. Accept the Offer: Board the craft and head to Aeloria.");
           System.out.println("2. Request Time to Prepare: Ask for a few days to get ready.");
           System.out.println("3. Politely Decline: Choose to stay behind and continue your work.");
            int answer3 = sc.nextInt();
            if(answer3 == 1){
                System.out.print("You accept the offer, enroute to Aeloria!");
            }
            else if(answer3 == 2){
                System.out.print("You spend the next few days in preparation.");
            }
            else if(answer3 == 3){
                System.out.print("You opt to stay behind, focusing on your work");
            }
            else{
                System.out.print("You die a very painful death due to your inaction.");
            }
       }
       else if(answer1 == 3){
           System.out.println("You picked Zarok!");
       }
       else{
           System.out.println("You get Jerry.");
           System.out.println("You die a very painful death due to your inaction.");
       }
       
       
       
	}
}