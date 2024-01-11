/*
 * Student Name: Santiago Ugarte
 * Lab Professor: Mr. David Haley / Teddy Yap
 * Due Date: 2023-02-17
 * Modified: 2023-02-17
 * Description: Lab exercise 03, "HardBread Implementation"
 */
public class Main {
	public static void main(String[] args){//main method
		
		/*
		 * Variable Declaration
		 */
		HardBread hardBread1 = new HardBread();
        HardBread hardBread2 = new HardBread(6.4, 18.7, 4.7, true);
        //String report;//not necesary variables
        //int totalSurfaceArea;
        
        /*
         * output for bread 1 and bread 2
         */
        System.out.printf("\nHard Bread 1:");
        System.out.printf("\nTotal Surface Area: %.4f",hardBread1.calculateTotalSurfaceArea());//we call the function total surface area 
        System.out.printf(hardBread1.toString());//report / call to string function
        
        System.out.printf("\n\nHard Bread 2:");
        System.out.printf("\nTotal Surface Area: %.3f",hardBread2.calculateTotalSurfaceArea());//we call the function total surface area
        System.out.printf(hardBread2.toString());// call to string function
        System.out.printf("\n\nProgram By Santiago Ugarte");


	}
}
