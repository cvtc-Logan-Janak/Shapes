package org.cvtc.shapes;

public class ShapesTest {
	public static void main(String[] args) {
		Shape cylinder = new Cylinder(7, 11);
		Shape sphere = new Sphere(9);
		Shape cuboid = new Cuboid(22, 13, 35);
		
		cylinder.render();
		sphere.render();
		cuboid.render();
	}

}
