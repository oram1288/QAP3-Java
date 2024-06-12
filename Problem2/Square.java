package QAP3_Java.Problem2;

public class Square extends Rectangle {
    // No-arg constructor
    public Square() {
        super(1.0, 1.0);
    }

    // Constructor with side
    public Square(double side) {
        super(side, side);
    }

    // Constructor with side, color, and filled
    public Square(double side, String color, boolean filled) {
        // use the super class’ constructor (Rectangle)
        super(side, side, color, filled);
    }

    // Getter for side
    public double getSide() {
        return getWidth();
    }

    // Setter for side
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override setWidth so it's a square
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override setLength so it's a square
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // toString method
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
