//ToDo: Supervisor wants programmer comments (use /* */ comment)

//ToDo: Supervisor wants programmer comments (use /* */ comment)
public class LumberChecker {

	public static final double EPSILON = 0.03125;
	 /*
	  * Public static variable called Epsilon (Tolerance maximum)
	  */
	public String validate(DimensionalLumber lumber) {
		
		
		/*
		 * checks if any of the inputted dimentions are negative
		 */
		if (lumber.getLength() < 0 || lumber.getWidth() < 0 || lumber.getThickness() < 0) {
			return "the lumber could not be verified due to negative dimensions.";
		}
		
		/*
		 *this flag is created to indicate that one or more dimentions are not in spec
		 */
		boolean flag = true;
		
		String output = "\nThis Lumber doesn't meet the following Specificaations: \n";// we create a string with the output in case there is a wrong measurement
		double n;
		if (Math.abs(lumber.getLength()-DimensionalLumber.EXPECTED_LENGTH) > EPSILON ) { // checks the dimention is within epsilon
			n = lumber.getLength()-DimensionalLumber.EXPECTED_LENGTH; // gets the dimensional difference
			output = output + " - Wrong Length by " + n + " inches\n"; // adds the string to the output string indicating the issue
			flag = false; // sets the flag to false so we know this lumber is not within dimensions
		}
		
		/*
		 * same program for width
		 */
		if(Math.abs(lumber.getWidth()-DimensionalLumber.EXPECTED_WIDTH) > EPSILON) {// checks the dimention is within epsilon
			n = lumber.getWidth()-DimensionalLumber.EXPECTED_WIDTH;
			output = output + " - Wrong Width by " + n + " inches\n";
			flag = false;
		}
		/*
		 * same program for thickness
		 */
		if(Math.abs(lumber.getThickness()-DimensionalLumber.EXPECTED_THICKNESS) > EPSILON) {// checks the dimention is within epsilon
			n = lumber.getThickness()-DimensionalLumber.EXPECTED_THICKNESS;
			output = output + " - Wrong Thickness by " + n + " inches\n";
			flag = false;
		}

		/*
		 * checks if the flag has been modified wich means one dimension is wrong 
		 * if no dimension is wrong returns the message  This Lumber meets the Specifications
		 */
		if(flag) {
			return "\nThis Lumber meets the Specifications.\n";
		}
		else {
			return output;//if a dimension is wrong returns the message created above
		}
		
		
	}
}
