/* 
    Lecture note example - Variables (String, int, double)
*/

class LectureVariables{
    public static void main(String args[]) {
        
        String name;
        name = new String("Alexander Hamilton");
        
        int number;
        number = 7;
        
        int num2 = 8; //a faster way to compile
        
        double money;
        money = 12.34;
        
        System.out.println(name + " lives in Cambridge, Massachusetts");
        System.out.println(name + " has " + number + " bathrooms in his house");
        System.out.println(name + " with his " + number + " bathrooms is $" + money + " in debt");

	}
}