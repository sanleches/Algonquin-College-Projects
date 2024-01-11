import java.util.Scanner;

/*
 * Student Name: Santiago Ugarte
 * Lab Professor:  Teddy Yap
 * Due Date: 2023-02-03
 * Modified: 2023-02-01
 * Description: Lab Exam 1, " Egg"
 */

public class Main {
	public static void main(String[]args) {
		/*
		 * We create an object of the class Egg
		 */
		Egg eggi = new Egg();
		Scanner keyboard = new Scanner(System.in);
		
		/*
		 * We prompt the user to input the egg's weight
		 */
		System.out.print("Please enter the egg's weight: ");
		eggi.setWeight(keyboard.nextDouble());
		keyboard.nextLine();
		
		/*
		 * We prompt the user to input the egg's price per ounce
		 */
		System.out.print("Please enter the price per ounce: ");
		eggi.setPrice(keyboard.nextDouble());
		keyboard.nextLine();
		
		/*
		 * We display the values that our get functions return
		 */
		System.out.printf("\ngetWeight() reports: %f",eggi.getWeight());
		System.out.printf("\ngetPricePerOunce() reports: %f",eggi.getPricePerOunce());
		System.out.printf("\ncalculateSalesCost() reports: %.2f",eggi.calculateSalesCost());
		System.out.printf("\n\nProgram Made By Santiago Ugarte");
		
	}
}
