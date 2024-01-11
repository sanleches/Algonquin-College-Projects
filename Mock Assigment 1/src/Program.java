import java.util.Scanner;

public class Program {
	public static void main(String[]args) {
		
		double radius,height,volume = 0;
		
		RightCircularCone cone = new RightCircularCone();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the ...r ");
		radius = keyboard.nextDouble();
		keyboard.nextLine();
		cone.setRadius(radius);
		
		System.out.print("Please enter the ..h ");
		height = keyboard.nextDouble();
		keyboard.nextLine();
		cone.setHeight(height);
		
		volume = cone.computeVolume();
		
		System.out.printf("The volume of the cone is " + volume + " cubic units.");
		System.out.printf("\nProgram by Santiago Ugarte.");
		
	}
}
