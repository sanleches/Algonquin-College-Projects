
public class HardBread {
	/*
	 * Variable declaration
	 */
	public final double Max_HEIGHT = 5.5; 
	public final double Max_LENGTH = 21.5; 
	public final double Max_WIDTH = 5.3; 
	private double height;
	private double length;
	private double width ;
	private boolean isOliveBread;
	
	/*
	 * default constructor
	 */
	public HardBread() {
		this.height = Max_HEIGHT;
		this.length = Max_LENGTH;
		this.width = Max_WIDTH;
		isOliveBread = true;
	}
	/*
	 * constructor with variables
	 */
	public HardBread(double height, double length, double width, boolean isOliveBread) {
		super();
		this.height = height;
		this.length = length;
		this.width = width;
		this.isOliveBread = isOliveBread;
	}
	/*
	 * Setters and getters for all the variables
	 */
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public boolean isOliveBread() {
		return isOliveBread;
	}

	public void setOliveBread(boolean isOliveBread) {
		this.isOliveBread = isOliveBread;
	}

	public double getMax_HEIGHT() {
		return Max_HEIGHT;
	}

	public double getMax_LENGTH() {
		return Max_LENGTH;
	}

	public double getMax_WIDTH() {
		return Max_WIDTH;
	}
	/*
	 * function that calculates the total surface area and returns the double value
	 */
	public double calculateTotalSurfaceArea() {
		return 2*(length*height +width*height + length*width );
	}
	/*
	 * toString functionality / (brings a report of the three variables )
	 */
	public String toString() {
		return String.format("\nHeight %.2f, Length %.2f, Width %.2f",height,length,width);
	}
}
