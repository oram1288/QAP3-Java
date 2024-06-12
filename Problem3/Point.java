package QAP3_Java.Problem3;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructor with parameters
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // No-arg constructor
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Getter and setter for x
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    // Getter and setter for y
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Setter for x and y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x and y
    public float[] getXY() {
        return new float[]{x, y};
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
