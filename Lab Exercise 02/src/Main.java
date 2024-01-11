import java.util.Scanner;

/*
 * Student Name: Santiago Ugarte
 * Lab Professor: Mr. David Haley / Teddy Yap
 * Due Date: 2023-02-03
 * Modified: 2023-02-01
 * Description: Lab exercise 02, " Implementing Car Class"
 */
public  class Main{
	public static void main(String[]args) {
		Car car = new Car();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the vin :");
		car.setVin(keyboard.next());
		keyboard.nextLine();
		
		System.out.print("Please enter the mileage :");
		car.setMileage(keyboard.nextDouble());
		keyboard.nextLine();
		
		System.out.print("Please enter the year :");
		car.setYear(keyboard.nextInt());
		keyboard.nextLine();
		
		System.out.print("Please enter the invoice :");
		car.setInvoice(keyboard.nextDouble());
		keyboard.nextLine();
		

		
	}
}
