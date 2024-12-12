/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        
        int [] arr = {5, 5, 7, 7, 7, 2, 9, 9}; //creates an array of size 8 with those specific values
        
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
            System.out.println();
            
        int x = 8;
        for(int i = 0; i < arr.length; i++){
            if(x == arr[i])
            System.out.print(i);
        }
            System.out.println();
        
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i + 1]){
                System.out.println("Consecutive at " + i + " and " + (i + 1));
            }
        }
	}
}