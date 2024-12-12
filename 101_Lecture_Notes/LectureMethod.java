/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
  
        int count = 0;
        while(count < 5){
            printAnimal();
            count++;
      }
      
        greeting("Spike");
        greeting("Mortis");
        
        double num = raise(6000, 6); // amount gets stored inside num
        num = raise(num, 6);
        num = raise(num, 6);
        num = raise(num, 6);
        num = raise(num, 6);
        num = raise(num, 6);
        num = raise(num, 6);
        num = raise(num, 6);
        num = raise(num, 6);
        System.out.println(num);
        
	}
	
	public static double raise(double salary, int percent){ // "," allows another input
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	}
	
	public static void greeting(String name){
	    System.out.println("こんにちは, " + name);
	}
	
	public static void printAnimal(){
	    System.out.println("      .");
	    System.out.println("\\_____)\\_____");
        System.out.println("/--v____ __`<");         
        System.out.println("        )/");  
        System.out.println("        '");
	}
	
}