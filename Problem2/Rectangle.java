package QAP3_Java.Problem2;

public class Rectangle extends Shape {

    private double width = 1.0;
    private double length = 1.0;

    // No-arg constructor
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor with width and length
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Constructor with width, length, color, and filled
    public Rectangle(double width, double length, String color, boolean filled) {
        // use the super class’ constructor (Shape)
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter methods
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    // Setter methods
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Method to get area
    public double getArea() {
        return width * length;
    }

    // Method to get perimeter
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // toString method
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}