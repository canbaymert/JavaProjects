package _02_geometricalCalculator;

public class Shape {

    double longSide;
    double shortSide;
    double radius;
    double height1;
    double side1;
    double side2;
    double side3;


    public Shape(double longSide, double shortSide) {
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    public Shape(double side1, double side2, double side3,double height1 ) {
        this.height1 = height1;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Shape(double radius) {
        this.radius = radius;
    }

    public double calculatePerimeterTriangle() { return side1+side2+side3;}

    public double calculatePerimeter() {
       return (longSide + shortSide) * 2;
   }

    public double calculateArea() {
        return longSide * shortSide;
    }

    public double calculateAreaCircle() {
        return radius * radius * 3.14;
    }

    public double calculateAreaTriangle() { return side1*height1*0.5; }

}
