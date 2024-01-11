/*
 * Info
 */
public class RightCircularCone {
	//this are fields od a cone
	private double radius;
	private double height;
	/*
	 * Constructor
	 */
	public RightCircularCone() {
		this(0.0, 0.0);
	}
	/*
	 * Second Constructor
	 */
	public RightCircularCone(double radius, double heighti) {
		this.radius = radius;
		height = heighti;
	}
	
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double computeVolume() {
		double volume;
		
		volume = (1.0/3.0)*Math.PI*Math.pow(radius, 2)*height;
		
		return volume;
	}
}
