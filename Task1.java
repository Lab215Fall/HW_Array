/* Question: Take input for size and elements of an int array. 
 Write a method which will return true if the array contains 3 consecutive integers with same value, return false otherwise. 
 Print appropriate message.  */


//   Name: 
//   ID:
//   Section: 


import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = sc.nextInt();
		
		//   Declare an int array of size n 
		
		//   Take input of all elements (you may use method for your convenience)
		
		sc.close();
		
	}
	
	public static boolean checkArray(int[] array){
		
		boolean found = false;
		
		//		implement your logic here and set the value of found as true if there are 3 consecutive same values
		
		return found;
	}

}
