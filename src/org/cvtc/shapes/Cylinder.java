package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class Cylinder extends Shape {
	
	// Declare Variables
	private float radius;
	private float height;
	
	// Generate Getters and Setters
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	public Cylinder(float radius, float height) {
		this.radius = radius;
		this.height = height;
	}
	
	// Generate ToString
	@Override
	public float surfaceArea() {
		return (radius + height) * radius * (float)Math.PI * 2;
	}
	
	@Override
	public float volume() {
		return radius * radius * (float)Math.PI * height;
	}
	
	@Override
	public void render() {
		JOptionPane.showMessageDialog(null,
				"Radius: " + radius +
				"\nHeight: " + height +
				"\nSurface Area: " + surfaceArea() +
				"\nVolume: " + volume(),
			    "Cylinder",
			    JOptionPane.PLAIN_MESSAGE);
	}
}
