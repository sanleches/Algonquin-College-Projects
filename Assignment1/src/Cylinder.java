
public class Cylinder {
	private double radius;
	  private double height;

	  Cylinder(){
	  }
	  Cylinder(double radius, double height) {
	    this.radius = radius;
	    this.height = height;
	  }

	  public double getRadius() {
		  return radius;
	  }
	  public void setRadius(double radius) {
		  this.radius = radius;
	  }
	  
	  public double getHeight() {
		  return height;
	  }
	  public void setHeight(double height) {
		  this.height = height;
	  }
	  
	  
	  public double curvedSurfaceArea() {
	    // Calculate curved surface area
	    return 2 * Math.PI * radius * height;
	  }

	  public double totalSurfaceArea() {
	    // Calculate total surface area
	    return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
	  }
}
