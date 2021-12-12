package ss6_inheritance.bai_tap;

public class PointAndMovablePointTest {
    public static void main(String[] args) {
        Point s1 = new Point(2.3f, 1.5f);
        Point s2 = new MovablePoint(s1.getX(), s1.getY(), 5.0f, 3.0f);

        System.out.println(s1);
        System.out.println(s2);
        ((MovablePoint)s2).move();
        System.out.println(s1);
        System.out.println(s2);
    }
}
