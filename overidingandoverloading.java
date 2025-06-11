abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    // Overriding
    double area() {
        return Math.PI * r * r;
    }

    // Overloading
    double area(double x) {
        return Math.PI * x * x;
    }

    void display() {
        System.out.println("Circle radius: " + r);
    }
}

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(5.5);
        c.display();
        System.out.println("Area: " + c.area());
        System.out.println("Area (3.0): " + c.area(3.0));
    }
}
