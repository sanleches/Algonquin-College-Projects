/*
 * Student Name: Santiago Ugarte
 * Lab Professor: Mr. David Haley / Teddy Yap
 * Due Date: 2023-02-03
 * Modified: 2023-02-01
 * Description: Lab exercise 02, " Implementing Car Class"
 */
public class Car {

	private String vin;
	private double mileage;
	private int year;
	private double invoice;
	private String str;
	
	public Car(){
		
	}
	public Car(String vin,double mileage,int year,double invoice) {
		this.vin =vin;
		this.mileage = mileage;
		this.year = year;
		this.invoice = invoice;
	}
	
	public void setVin(String vin) {
		this.vin = vin;
	}
	
	public String getVin() {
		return this.vin;
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public double getMileage() {
		return this.mileage;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setInvoice(double invoice) {
		this.invoice = invoice;
	}
	
	public double getInvoice() {
		return this.invoice;
	}
	
	public String toString(){
		
		str = String.format("%s, %.1f(KM), %,$ %.2f",vin,mileage,year,invoice);
				
		return str;
	}
	
}
