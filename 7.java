
import java.util.Scanner;

public class Areacal {
    
    // Method to calculate the area of a rectangle
    public void Area(int length, int width) {
        int area = length * width;
        System.out.println("Area of rectangle: " + area);
    }

    // Method to calculate the area of a square
    public void Area(int side) {
        int area = side * side;
        System.out.println("Area of square: " + area);
    }

    // Method to calculate the area of a trapezium
    public void Area(double base1, double base2, double height) {
        double area = 0.5 * (base1 + base2) * height;
        System.out.println("Area of trapezium: " + area);
    }

    public static void main(String[] args) {
        // Create an object of the class
        Areacal cal = new Areacal();
        
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Input for rectangle
        System.out.println("Enter the length and width of the rectangle: ");
        int length = sc.nextInt();
        int width = sc.nextInt();
        cal.Area(length, width);

        // Input for square
        System.out.println("Enter the side of the square: ");
        int side = sc.nextInt();
        cal.Area(side);
        
        // Input for trapezium
        System.out.println("Enter the base1, base2, and height of the trapezium: ");
        double base1 = sc.nextDouble();
        double base2 = sc.nextDouble();
        double height = sc.nextDouble();
        cal.Area(base1, base2, height);

        // Close the scanner
        sc.close();
    }
}
