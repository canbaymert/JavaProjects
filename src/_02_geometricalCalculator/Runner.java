package _02_geometricalCalculator;

import java.util.Scanner;

public class Runner {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }


    private static void mainMenu() {
        System.out.println();
        System.out.println("Choose a geometrical shape : \n1 : Circle\n2 : Square\n3 : Triangle\n4 : Rectangle" +
                "\n5 : Exit");
        System.out.println();
        System.out.print("Your choice : ");
        int choice = 0;
        try {
            choice = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Wrong entry");
            mainMenu();
        }
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
                System.out.println("Enter all 3 sides of the triangle : ");
                int x = 0, y = 0, z = 0, h = 0;
                try {
                    x = Integer.parseInt(scan.nextLine());
                    y = Integer.parseInt(scan.nextLine());
                    z = Integer.parseInt(scan.nextLine());
                    System.out.println("Enter the height of first typed side of the triangle : ");
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
                System.out.println("Enter long and short sides of the rectangle : ");
                int q = 0, w = 0;
                try {
                    q = Integer.parseInt(scan.nextLine());
                    w = Integer.parseInt(scan.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Wrong entry");
                    mainMenu();
                }
                if(q<w){
                    int temp=w;
                    w=q;
                    q=temp;
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

