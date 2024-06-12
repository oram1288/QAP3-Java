package QAP3_Java.Problem3;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // Constructor with parameters
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        // use the super class’ constructor (Point)
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // No-arg constructor
    public MovablePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    // Getter methods
    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    // Setter methods
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Setter for xSpeed and ySpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter for xSpeed and ySpeed
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", speed = (" + xSpeed + "," + ySpeed + ")";
    }

    // move method
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
