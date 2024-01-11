/*
 * Student Name: Santiago Ugarte
 * Lab Professor: David 
 * Due Date: 2023-0404
 * Description: Lab Exam 02 Section 303
 */

import java.util.Scanner;

public class Program {
		
	public static void main(String[] args) {
		
		/*
		 * We create a new scanner called Keyboard
		 */
		Scanner keyboard = new Scanner(System.in);
		
		/*
		 * We create a new instance of the object egg
		 */
		Egg egg = new Egg();
		/*
		 * we create a boolean called moreData wich will decide if the loop while continues or not
		 */
		boolean moreData = true;
		
		/*
		 * loop starts
		 */
		while(moreData){
			
			/*
			 * we promt the user the message asking for the egg's weight
			 * then we call the funcion setWeight from the class egg and we pass the value that the user will input on the console
			 */
			System.out.print("Please enter the egg's weight: ");
			egg.setWeight(keyboard.nextDouble()); 
			keyboard.nextLine(); // for console cleanliness and bug prevention
			
			/*
			 * we promt the user the message asking for the egg's price per ounce
			 * then we call the funcion setPricePerOunce from the class egg and we pass the value that the user will input on the console
			 */
			System.out.print("Please enter price per ounce: ");
			egg.setPricePerOunce(keyboard.nextDouble()); 
			keyboard.nextLine();// for console cleanliness and bug prevention
			
			/*
			 * we make an output to the console of the text "checkSalesCost() reports: " concatenated 
			 * with the actual report from the function checkSalesCost() from the class egg
			 */
			System.out.println("checkSalesCost() reports: " + egg.checkSalesCost());
			
			
			/*
			 * we create a flag called bad Input as a marker for the state of the input of the user
			 * It will only be set to false once a valid (yes or no) option is imputted
			 */
			boolean badInput = true;
			String termination; //we create a string that will hold the user input
			
			/*
			 * program termination or continuation asking loop
			 */
			while(badInput) {
				
				System.out.printf("\nEnter values again ? (Y,N): "); // asks the user if he wants to continue with the program
				termination = keyboard.nextLine();//we ask to the user for the answer
				
				if(termination.equalsIgnoreCase("n")) { // in case of a no answer regardless of uppercase sets the flags to false and the program is terminated
					System.out.println("Program by Santiago Ugarte."); // we output the final line
					moreData = false; // we set the loop flag to false
					badInput = false; // we set the badInput flag to false
				}
				else if(termination.equalsIgnoreCase("y")) { // in case the user answers yes regardless of uppercase it sets badinput to false
					badInput = false; // we set the badInput flag to false
				}
				else {
					System.out.println("Invalid, please type a valid option."); // in case of neither a yes or no answer asks for a valid input
				}
			}
		}
		
		
	}
}
