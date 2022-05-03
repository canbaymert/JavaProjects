package _02_geometricalCalculator;

public class Rectangle extends Shape {

	public Rectangle(double longSide, double shortSide) {
		super(longSide, shortSide);

	}


	public double calculatePerimeter() {
		return super.calculatePerimeter();
	}


	public double calculateArea() {
		return super.calculateArea();
	} 


	@Override
	public String toString() {
		return "Long Side = " + longSide + "\nShort Side = " + shortSide + "\nRectangle Perimeter = " + calculatePerimeter()
				+ "\nRectangle Area = " + calculateArea();
	}
}
