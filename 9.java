import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        this.radius = sc.nextDouble();
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}

class Rectangle implements Shape {
    private int length;
    private int width;

    public Rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and width: ");
        this.length = sc.nextInt();
        this.width = sc.nextInt();
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("In Menu: \n1. Circle \n2. Rectangle \n3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            Shape shape = null;
            if (choice == 1) {
                shape = new Circle();
            } else if (choice == 2) {
                shape = new Rectangle();
            } else if (choice == 3) {
                System.out.println("Exit");
                break;
            }

            if (shape != null) {
                System.out.println("Area: " + shape.area());
                System.out.println("Perimeter: " + shape.perimeter());
            }
        } while (choice != 3);
    }
}
