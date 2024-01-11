
//ToDo: Supervisor wants programmer comments (use /* */ comment)
public class Main {

	//ToDo: Supervisor wants programmer comments (use /* */ comment)
	public static void main(String[] args) {
		LumberChecker lumberChecker = new LumberChecker();
		/*
		 * We create a new instance of the object LumberChecker - Santiago
		 */
		User user = new User();
		/*
		 * We create a new instance of the object User - Santiago
		 */
		boolean moreData = true;
		/*
		 * We create a variable called moreData, this is a flag that will determine if the program continues or terminates - Santiago
		 */
		
		String termination;
		/*
		 * This variable holds the string that will be shown to the user asking if the program should be terminated or if the user wishes to input more data - Santiago
		 */
		
		/*
		 * This is the main while wich will loop while the program is still in use, this will terminate the program if the user indicates so.
		 */
		while(moreData){
			
			System.out.println("Enter dimensions for Lumber.");
			System.out.println("Expected values for dimensions are 1.50 for thickness, 5.50 for width, 192.00 for length.\n");
			/*
			 * Standard outputs of the program
			 */

			DimensionalLumber lumber = new DimensionalLumber(user.inputDouble("Enter measured thickness (inches): ")
					,user.inputDouble("Enter measured width (inches): "),user.inputDouble("Enter measured length (inches): "));
			/*
			 * this creates a new instance of the class dimensional lumber and asks the user for the dimensions
			 */
			
			System.out.println( lumberChecker.validate(lumber) ); // sennd the object lumber to be validated by lumberchecker
			
			System.out.println(lumber.toString()); // prints the string returned by the toString funcion in lumber
			
			System.out.println( "Program by Santiago Ugarte\n"); // standart output
			
			boolean badInput = true; // this is a flag that indicates a bad input so the program restarts and asks for the answer instead of crashing
			
			while(badInput) {
				termination = user.inputString("Is there more data to enter ? (yes, no): "); // asks the user if he wants to continue with the program
				
				if(termination.equalsIgnoreCase("no")) { // in case of a no answer regardless of uppercase sets the flags to false and the program is terminated
					System.out.println("\nProgram Terminated.");
					moreData = false;
					badInput = false;
				}
				else if(termination.equalsIgnoreCase("yes")) { // in case the user answers yes regardless of uppercase it sets badinput to false
					badInput = false; //
				}
				else {
					System.out.println("Invalid, please type a valid option."); // in case of neither a yes or no answer asks for a valid input
				}
			}
			
		}
		
		

	}
}