/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		 int [] arr = new int[1001];
		 int x = 0;
		 int y = 3;
		 while(x < 1001){
		 	arr[x] = y;
		 	System.out.println(arr[x]);
		 	x++;
		 	y = y + 3;
		 }
		 
		 System.out.println();
		 
		 int [] arr2 = new int[1001];
		 int x2 = 0;
		 int y2 = 1000;
		 while(x2 < 1001){
		 	arr[x2] = y2;
		 	System.out.println(arr[x2]);
		 	x2++;
		 	y2 = y2 - 1;
		 }
	}
}
