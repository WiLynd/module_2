package ss6_inheritance.bai_tap;

public class Point2DPoint3DTest {
    public static void main(String[] args) {
        Point2D s1 = new Point2D(1.5f,2.0f);
        Point2D s2 = new Point3D(2.5f,1.7f,5.2f);

        float [] array1 = s1.getXY();
        float [] array2 = ((Point3D)s2).getXYZ();

        for (float x1 : array1)
            System.out.println(x1);

        for (float x1 : array2)
            System.out.println(x1);
    }
}
