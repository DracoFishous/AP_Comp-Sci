package pkg;

public class CVMath {		
	//i did this with sakura and pam!!
	public static void specialSquare(int howMany){
		int count = 1;
		int i = 0;
		while(i < howMany){
			if(isTriangular(count) && isPerfect(count)){
				System.out.println((count) + " is a special square!");
				i++;
			}
			count++;
		}
	}

	public static boolean isTriangular(int num){
		int i = 1;
		int sum = 0;
		while(sum < num){
			sum = sum + i;
			i++;
		}
		return sum == num;
	}
	
	public static boolean isPerfect(int num){
		int sqrt = (int)(Math.sqrt(num));
		return sqrt * sqrt == num;
	}

}
	
	
	/*public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	*/

