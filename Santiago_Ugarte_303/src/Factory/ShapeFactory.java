package Factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import PossibleObjects.Cylinder;

import PossibleObjects.Cuboid;

public class ShapeFactory {
	
	Scanner input = new Scanner(System.in);
	
	 private int getMenuItem(int optns) {
	    	
	        while (true) {
	        	
	            System.out.print("Select action:");
	            // if that checks if the selection its between the correct bounds
	            if (input.hasNextInt()) {
	                int selection = input.nextInt();
	                if (selection >= 1 && selection <= optns) {
	                    input.nextLine(); // Consume the remaining newline character
	                    return selection;
	                }
	                else {
	                	System.out.println("Please select a number in the range");
	                }
	            }
	            //in case of an invalid input
	            else {
	            input.nextLine(); // Consume the invalid input
	            System.out.println("Please enter an integer");//error message
	            }
	        }
	    }
	
	public Shape createShape(int parameter) {
		
		public static void main(String[] args) {
			  
		System.out.println("Select a Shape:");
        System.out.println("	1. Cylinder");
        System.out.println("	2. Cuboid");
        System.out.println("	3. Exit");
			
		int selection = getMenuItem(2);
		
		if (selection == 1 ) {
			System.out.println("Create Cylinder");
			System.out.print("Enter radius: ");
			double radius = input.nextDouble();
			System.out.print("Enter height: ");
			double heigth = input.NextDouble();
			return new Cylinder(radius, heigth);
		}
		else if(selection == 2) {
			System.out.println("Create Cylinder");
			System.out.print("Enter radius: ");
			double width = input.nextDouble();
			System.out.print("Enter height: ");
			double heigth = input.NextDouble();
			System.out.print("Enter height: ");
			double length = input.NextDouble();
			return new Cuboid(width, heigth, length);

		}
		else if(selection == 3) {
			
		}
	  }
		
		
	}
	       


}
