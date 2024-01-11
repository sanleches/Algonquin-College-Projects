/*
 * Author: David Haley
 * Date:   May 18, 2021, Updated 21 Sep 2021
 * Description: Sequential program to Calculate Tax on a supplied amount
 *              Based upon Problem Solving Example in Week 1's Lecture
 *
 * Important Disclaimer: type double or type float should NEVER be used
 *                       for monetary calculations because these non-integer
 *                       calculations lack the required precision.
 *                       Rather, objects of type BigDecimal should be used
 *                       (beyond the scope of this course)			
 */
import java.util.Scanner;    // for keyboard input

public class TaxCalculator {

	public static void main(String[] args) {
		
		// constant TAX Rate of 13% (Hortsmann page 102..104)
		final double TAX = 0.13;
		
		// create a Scanner object named keyboard
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the amount paid $ ");

		// amount user paid
		double number = keyboard.nextDouble(); 
		  
		// value of tax in Ontario to be paid
		double value = number * TAX; 
		
		System.out.println("The tax to be paid = $ " + value);

		// See Hortsmann Text Page 117, Table 6, Page 394, Table 2,
	    // Page 395, Table 3
		System.out.printf("The tax to be paid = $ %.2f\n",value); 
		
		System.out.println("Program by David Haley");
		
	}

}