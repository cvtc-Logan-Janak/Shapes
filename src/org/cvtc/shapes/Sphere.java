package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class Sphere extends Shape {

	// Declare Variables
	private float radius;

	// Generate Getters and Setters
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public Sphere(float radius) {
		this.radius = radius;
	}
	
	// Generate ToString
	@Override
	public float surfaceArea() {
		return radius * radius * (float)Math.PI * 4;
	}
	
	@Override
	public float volume() {
		return (float)((4.0/3.0) * Math.PI * Math.pow(radius, 3));
	}
	
	@Override
	public void render() {
		JOptionPane.showMessageDialog(null,
				"Radius: " + radius +
				"\nSurface Area: " + surfaceArea() +
				"\nVolume: " + volume(),
			    "Sphere",
			    JOptionPane.PLAIN_MESSAGE);
	}
}
