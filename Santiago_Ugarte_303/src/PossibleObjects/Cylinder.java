package PossibleObjects;

import Factory.Shape;

public class Cylinder implements Shape{
	
	private double radius, height;
	
	public Cylinder(double r, double h){
		this.radius = r;
		this.height = h;
		
	}
	
	public double CalculateVolume() {
		
		return Math.PI*radius*radius*height;
	}
	
	
	public double getRadius() {
		
		return radius;
	}
	
	public double getHeight() {
		
		return height;
	}
		
}
