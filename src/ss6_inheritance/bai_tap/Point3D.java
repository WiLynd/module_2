package ss6_inheritance.bai_tap;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float [] getXYZ() {
        float [] sample = {this.getX(),this.getY(),this.z};
        return sample;
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D { x = "
                + this.getX()
                + ", y = "
                + this.getY()
                + ", z = "
                + this.z
                + " }";
    }
}
