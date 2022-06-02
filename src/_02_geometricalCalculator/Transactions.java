package _02_geometricalCalculator;

import java.util.Scanner;

import static _02_geometricalCalculator.Menu.mainMenu;


public class Transactions {
    static Scanner scan = new Scanner(System.in);

    protected static void transactions(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Enter radius(r) of the circle : ");
                int r = 0;
                try {
                    r = Integer.parseInt(scan.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Wrong entry");
                    mainMenu();
                }
                Circle c = new Circle(r);
                System.out.println("Radius = " + c.radius + ", \nCircle  Circumference = " + c.calculateCircumference()
                        + "\nCircle Area = " + c.calculateAreaCircle());
                break;
            case 2:
                System.out.print("Enter a side of the square : ");
                int a = 0;
                try {
                    a = Integer.parseInt(scan.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Wrong entry");
                    mainMenu();
                }
                Square s = new Square(a, a);
                System.out.println("Side = " + s.longSide + "\nSquare Perimeter = " + s.calculatePerimeter()
                        + "\nSquare Area = " + s.calculateArea());
                break;
            case 3:
                System.out.println("Enter the size of side a, side b, side c, and the upright distance of Point A to side a : ");
                int x = 0, y = 0, z = 0, h = 0;
                System.out.print("Side a : ");
                try {
                    x = Integer.parseInt(scan.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Wrong entry");
                    mainMenu();
                }
                System.out.print("Side b : ");
                try {
                    y = Integer.parseInt(scan.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Wrong entry");
                    mainMenu();
                }
                System.out.print("Side c : ");
                try {
                    z = Integer.parseInt(scan.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Wrong entry");
                    mainMenu();
                }
                System.out.print("The upright distance of Point A to side a : ");
                try {
                    h = Integer.parseInt(scan.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Wrong entry");
                    mainMenu();
                }
                Triangle t = new Triangle(x, y, z, h);
                System.out.println("Side 1 = " + t.side1 + "\nSide 2= " + t.side2 + "\nSide 3 = " + t.side3 +
                        "\nHeight 1 = " + t.height1 + "\nTriangle Perimeter = " + t.calculatePerimeterTriangle() +
                        "\nTriangle Area = " + t.calculateAreaTriangle());
                break;
            case 4:
                System.out.println("Enter size of the first side of the rectangle : ");
                int q = 0, w = 0;
                try {
                    q = Integer.parseInt(scan.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Wrong entry");
                    mainMenu();
                }
                System.out.println("Enter size of the second side of the rectangle : ");
                try {
                    w = Integer.parseInt(scan.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Wrong entry");
                    mainMenu();
                }
                if (q < w) {
                    int temp = w;
                    w = q;
                    q = temp;
                }
                Rectangle o = new Rectangle(q, w);
                System.out.println("Long Side = " + o.longSide + "\nShort Side = " + o.shortSide +
                        "\nRectangle Perimeter = " + o.calculatePerimeter() + "\nRectangle Area = " + o.calculateArea());
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("Wrong entry");
                mainMenu();
        }
        mainMenu();
    }
}

