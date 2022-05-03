package _02_geometricalCalculator;

public class Triangle extends Shape {


    public Triangle(double side1, double side2, double side3, double height1) {
        super(side1, side2, side3, height1);
    }

    public double calculateAreaTriangle() {
        return super.calculateAreaTriangle();
    }

    public double calculatePerimeterTriangle() {
        return super.calculatePerimeterTriangle();
    }

    @Override
    public String toString() {
        return "Side 1 = " + side1 + "\nSide 2= " + side2 + "\nSide 3 = " +side3 + "\nHeight 1 = " +height1 +
                "\nTriangle Perimeter = " + calculatePerimeterTriangle() +"\nTriangle Area = " +calculateAreaTriangle();
    }
}
