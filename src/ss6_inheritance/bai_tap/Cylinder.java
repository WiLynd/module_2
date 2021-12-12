package ss6_inheritance.bai_tap;

public class Cylinder extends Circle{
    private double height = 3.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius,String color,double height) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea()
    {
        return Math.PI*2*(this.getRadius()*this.getRadius()+this.getRadius()*this.height);
    }

    public double getVolume() {
        return Math.PI*this.getRadius()*this.getRadius()*this.height;
    }


    @Override
    public String toString() {
        return "A Cylinder with radius = "
                + getRadius()
                + "and height = "
                +getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
}