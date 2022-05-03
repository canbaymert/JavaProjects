package _02_geometricalCalculator;

public class Circle extends Shape {
	
	public Circle(double radius) {
		super(radius );
	}

	public double calculateCircumference() {
		return radius*2*3.14;
	}

	public double calculateAreaCircle() {
		return radius*radius*3.14;
	}


	@Override
	public String toString() {
		return "Radius = " + radius + ", \nCircle  Circumference = " + calculateCircumference()+"\nCircle Area = "+calculateAreaCircle();
	}
}
