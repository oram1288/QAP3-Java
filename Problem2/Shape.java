package QAP3_Java.Problem2;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    // No-arg constructor
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Constructor with parameters
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter methods
    public String getColor() {
        return color;
    }

    public boolean getFilled() {
        return filled;
    }

    // Setter methods
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // toString method
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }
}
