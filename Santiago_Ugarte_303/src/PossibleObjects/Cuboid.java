package PossibleObjects;

import Factory.Shape;

public class Cuboid implements Shape{
	
	private double length, width, height;
	
	public Cuboid(double w, double h, double l){
		this.length = l;
		this.height = h;
		this.width = w;
	}
	
	public double CalculateVolume() {
		
		return length*width*height;
	}
	
	public double getLength() {
		
		return length;
	}
	
	public double getWidth() {
		
		return width;
	}
	public double getHeight() {
		
		return height;
	}
}
