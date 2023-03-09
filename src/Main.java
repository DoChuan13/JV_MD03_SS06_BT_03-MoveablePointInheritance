import point.MoveablePoint;
import point.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(10, 20);
        System.out.println("First Point ==> " + point);

        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setXY(30, 40);
//        System.out.println("Second Point ==> " + moveablePoint);
        moveablePoint.setSpeed(75, 85);
        System.out.println("Second Point ==> " + moveablePoint);
        System.out.println("Second Point ==> " + moveablePoint.move());
    }
}
