package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class Cuboid extends Shape {
	
	// Declare Variables
	private float width;
	private float height;
	private float depth;
	
	// Generate Getters and Setters
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getDepth() {
		return depth;
	}
	public void setDepth(float depth) {
		this.depth = depth;
	}
	
	public Cuboid(float width, float height, float depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	// Generate ToString
	@Override
	public float volume() {
		return width * height * depth;
	}
	
	@Override
	public float surfaceArea() {
		return 2 * (width * height + width * depth + height * depth);
	}
	
	@Override
	public void render() {
		JOptionPane.showMessageDialog(null,
				"Width: " + width +
				"\nHeight: " + height +
				"\nDepth: " + depth +
				"\nSurface Area: " + surfaceArea() +
				"\nVolume: " + volume(),
			    "Cylinder",
			    JOptionPane.PLAIN_MESSAGE);
	}
}
