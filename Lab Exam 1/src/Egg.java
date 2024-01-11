
public class Egg {
	/*
	 * We define the variables.
	 */
	private double weight;
	private double price;
	private static double markup = 1.35;
	
	/*
	 * No argument Constructor sets field to zero.
	 */
	public Egg() {
		this(0.0, 0.0);
	}
	
	/*
	 * Second Constructor with values.
	 */
	public Egg(double weight, double price){
		this.weight = weight;
		this.price = price;
	}
	
	/*
	 * Create the setters and getters for weight and price
	 */
	public double getWeight(){
		return weight;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public double getPricePerOunce(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getMarkup(){
		return markup;
	}
	
	/*
	 * Create the askingPrice function
	 */
	public double calculateSalesCost(){
		return (weight*price*markup);
	}
	
	
	
}
