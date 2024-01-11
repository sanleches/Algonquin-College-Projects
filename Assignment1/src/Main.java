import java.util.Scanner;

/*
 * Student Name: Santiago Ugarte
 * Lab Professor: Mr. David Haley / Teddy Yap
 * Due Date: 2023-02-03
 * Modified: 2023-02-01
 * Description: Lab exercise 02, " Implementing Car Class"
 */

public class Main {
	public static void main(String[]args) {
	    
		Scanner keyboard = new Scanner(System.in);
	    
	    // Create a cylinder object
	    Cylinder cylinder = new Cylinder();
	    
		
		// Read cylinder radius and height from user input
		System.out.print("Enter cylinder radius: ");
		cylinder.setRadius(keyboard.nextDouble());
		keyboard.nextLine();
		
		System.out.print("Enter cylinder height: ");
		cylinder.setHeight(keyboard.nextDouble());
		keyboard.nextLine();

	    // Calculate curved surface area and total surface area
	    double curvedSurfaceArea = cylinder.curvedSurfaceArea();
	    double totalSurfaceArea = cylinder.totalSurfaceArea();

	    // Display results
	    System.out.printf("\nCurved Surface Area: %.3f",curvedSurfaceArea);
	    System.out.printf("\nTotal Surface Area: %.3f",totalSurfaceArea);
	    System.out.println("\nProgram by Santiago Ugarte");
  }
}
