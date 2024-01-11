/*
 * Student Name: Santiago Ugarte
 * Lab Professor: David 
 * Due Date: 2023-0404
 * Description: Lab Exam 02 Section 303
 */

/*
 * this class represents a Egg 
 */
public class Egg {
	private double weight; // weight of one egg
	private double pricePerOunce; // price per ounce of egg
	
	/*
	 * no argument constructor, sets fields to zero
	 */
	public Egg() {
		weight = 0.0;
		pricePerOunce = 0.0;
	}

	/*
	 * accessor for weight 
	 */
	public double getWeight() {
		return weight;
	}

	/*
	 * mutator for weight 
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/*
	 * accessor for pricePerOunce
	 */
	public double getPricePerOunce() {
		return pricePerOunce;
	}

	/*
	 * mutator for pricePerOunce
	 */
	public void setPricePerOunce(double pricePerOunce) {
		this.pricePerOunce = pricePerOunce;
	}

	/*
	 * This worker method calculates the total
	 * amount of the price of an egg
	 * using the weight and pricePerOunce fields
	 * plus the grocery store markup of 1.35
	 */
	public double calculateSalesCost() {
		double salesCost = weight * pricePerOunce * 1.35;
	return salesCost;
	}

    /*
     * ToDo write programmer comments here
     */
    public String checkSalesCost(){
        String report = ""; // string that will hold the output string
        double salesCost = calculateSalesCost(); // variable that holds the salescost value
        
        if(salesCost < 0) { //we compare if the value is less than cero
        	report = "User input of Weight or Price is Invalid" ;//output in this case
        }
        else if(salesCost >= 0 && salesCost <= 0.19) { // we compare if the value is between 0 and 0.19
        	report = "Sales Cost is Very Ideal"; //output in this case
        }
        else if(salesCost > 0.19 && salesCost <= 0.28) { // we compare if the value is between 0.19 and 0.28
        	report = "Sales Cost is Ideal"; //output in this case
        }
        else if(salesCost > 0.28) {// we compare if the value is more than 0.28
        	report = "Sales Cost is very high"; //output in this case
        }
         
	  return report; // return the actual report
    }	    
}
