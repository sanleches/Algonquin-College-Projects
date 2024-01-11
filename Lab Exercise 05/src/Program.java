
/*
 * Student Name: Santiago Ugarte
 * Lab Professor: David Houdman
 * Due Date: 2023-04-07
 * Description: Lab Exercise 05
 */
public class Program {

	/*
	 * Add programmer comments here.
	 */
		public static void main(String[] args) {
		// Each character corresponds to the first letter of the menu option
		// For example, 'E' corresponds to (E)nter, but you must accept
		// lower case characters as well - 'e', 'd', 'r', and 'q'
		final char ENTER_VALUES = 'E';
		final char DISPLAY_REPORT = 'D';
		final char RESET_VALUES = 'R';
		final char QUIT_PROGRAM = 'Q';
		char option = 'Q';
		DiceChecker diceChecker = new DiceChecker(); 
		
		boolean menu = true;
		do{
			System.out.println( "(E)nter Dice Roll Values");
			System.out.println( "(D)isplay Report");
			System.out.println( "(R)eset Dice Roll Data");
			System.out.println( "(Q)uit Program");
			option = User.inputCharacter("Option: ");
			
			switch(Character.toUpperCase(option)) {
			case ENTER_VALUES:
				System.out.println("\nEnter Data");
				diceChecker.enterData();
				break;
			case DISPLAY_REPORT:
				System.out.println("\nDisplay report");
				diceChecker.printReport();
				break;
			case RESET_VALUES:
				System.out.println("\nReset Values");
				diceChecker.resetData();
				break;
			case QUIT_PROGRAM:
				System.out.println("\nProgram By Santiago Ugarte");
				menu = false;
				break;
			default:
				System.out.println("Error Wrong Option");
			}
			
		}while(menu);
		
		
	}

}