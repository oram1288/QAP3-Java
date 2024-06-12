package QAP3_Java.Problem2;

public class Circle extends Shape {
    private double radius = 1.0;

    // No-arg constructor
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor with radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor with radius, color, and filled
    public Circle(double radius, String color, boolean filled) {
        // use the super class’ constructor (Shape)
        super(color, filled);
        this.radius = radius;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to get area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to get perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // toString method
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
