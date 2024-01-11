/*
 * Lab Exercise 04 (23W) Task 1 Starter Code
 * Author: David Haley
 * Modified By: Santiago Ugarte
 * Desciption: Lab Exercise 04 Task 1
 * [1]   The Government of Canada’s Department of Fisheries and Oceans Canada (DFO) Website
 * – Offshore lobster and Jonah crab - Maritimes Region. Para 1.3.1 Management approach
 * https://www.dfo-mpo.gc.ca/fisheries-peches/ifmp-gmp/lobster-crab-homard/2019/index-eng.html
 * (Accessed February 27, 2023)
 * [2]  Wikipedia The Free Encyclopedia – Definition of Carapace.
 * https://en.wikipedia.org/wiki/Carapace
 * [3] A. Morgana. Rubber Duck Debugging: Why it is the best way to debug your code. Blog.zenhub.com.
 * https://blog.zenhub.com/why-rubber-duck-debugging-is-the-best-way-to-debug-your-code/ (Accessed February 27, 2023)
 */

import java.util.Scanner;

/*
 * This class uses class Lobster to provide a report
 * to indicate if a Lobster is a legal size or a prohibited size,
 * based on its carapace length.
 */
public class LobsterSizeChecker {

	/*
	 * The main method asks for a length, uses an instance 
	 * of class Lobster to generate a report, and writes
	 * the report to the console.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Lobster myLobster = new Lobster();
		double length;
		String report;
		
		System.out.printf("%s", "Lobster’s Carapace Length: ");
		length = keyboard.nextDouble();
		myLobster.setLength(length);
		/*
		 * Santiago Ugarte
		 * This was modified so we pass the inputted length to size report, that way the program will be able to 
		 * compare and determine if the lobster is the right size or not.
		 */
		report = myLobster.sizeReport();
		
		System.out.printf("%s%n", report);
		System.out.printf("%s%n", "Program modified by Santiago Ugarte");
		
	}

}