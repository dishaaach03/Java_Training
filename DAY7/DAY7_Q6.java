import java.util.Scanner;

// Base class Shape
class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public double calculateArea() {
        return 0;
    }

    public String getShapeName() {
        return shapeName;
    }
}

// Square class extending Shape
class Square extends Shape {
    private int side;

    public Square(int side) {
        super("Square");
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public int getSide() {
        return side;
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private int length, breadth;

    public Rectangle(int length, int breadth) {
        super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

// Circle class extending Shape
class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("Area Calculator --- Choose your shape");

        int choice = scanner.nextInt();
        Shape shape = null;

        switch (choice) {
            case 1:
                System.out.println("Enter length and breadth:");
                int length = scanner.nextInt();
                int breadth = scanner.nextInt();
                shape = new Rectangle(length, breadth);
                break;
            case 2:
                System.out.println("Enter side:");
                int side = scanner.nextInt();
                shape = new Square(side);
                break;
            case 3:
                System.out.println("Enter radius:");
                int radius = scanner.nextInt();
                shape = new Circle(radius);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        System.out.printf("Area of %s is:%.2f\n", shape.getShapeName(), shape.calculateArea());
        scanner.close();
    }
}
