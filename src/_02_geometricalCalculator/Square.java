package _02_geometricalCalculator;

public class Square extends Rectangle {


	public Square(double longSide, double shortSide) {
		super(longSide, shortSide);
	}

	@Override
	public String toString() {
		return "Side = " + longSide + "\nSquare Perimeter = " + calculatePerimeter()
				+ "\nSquare Area = " + calculateArea();
	}


	


	


	
	
	
	
	
	
	
}
