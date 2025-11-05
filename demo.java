import java.util.Scanner;

abstract class Shape {
    int a, b;
    abstract void printArea();
}

class Rectangle extends Shape {
    void printArea() {
        System.out.println("The area of rectangle is = " + (a * b));
    }
}

class Circle extends Shape {
    void printArea() {
        System.out.println("The area of circle is = " + (3.14 * a * a));
    }
}

class Triangle extends Shape {
    void printArea() {
        System.out.println("The area of triangle is = " + (0.5 * a * b));
    }
}

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle
        System.out.println("Enter length and breadth of rectangle:");
        Rectangle r = new Rectangle();
        r.a = sc.nextInt();
        r.b = sc.nextInt();
        r.printArea();

        // Circle
        System.out.println("Enter radius of circle:");
        Circle c = new Circle();
        c.a = sc.nextInt();
        c.printArea();

        // Triangle
        System.out.println("Enter base and height of triangle:");
        Triangle t = new Triangle();
        t.a = sc.nextInt();
        t.b = sc.nextInt();
        t.printArea();

        sc.close();
    }
}
