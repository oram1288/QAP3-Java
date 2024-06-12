package QAP3_Java.Problem3;

public class Demo {
    public static void main(String[] args) {
        Point point = new Point(1.0f, 2.0f);
        System.out.println(point); // (1.0,2.0)
        System.out.println();

        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println(movablePoint); // (1.0,2.0),speed=(0.5,1.5)
        System.out.println();

        movablePoint.move();
        System.out.println(movablePoint); // (1.5,3.5),speed=(0.5,1.5)
        System.out.println();
    }
}
