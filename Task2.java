
/*
 * 
 * Write a method that checks the following conditions to check whether a string is a valid password or not.
•	A password must have at least eight characters.
•	A password consists of only letters and digits.
•	A password must contain at least two digits.

Name: 
ID:
Sec: 

 */


import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String password = input.nextLine();
		input.close();
		
		boolean valid = checkPassword(password);
		
		if(valid==true){
			System.out.println("The password is valid :)");
		}
		else{
			System.out.println("Invalid! :(");
		}

	}

	public static boolean checkPassword(String password) {
		
		boolean valid = true;
		
		//  There are 3 conditions, right? Check each condition and set valid =  false if any of the conditions is violated. See the lab manual's library methods as reference
			
		
		return valid;
	}

}
