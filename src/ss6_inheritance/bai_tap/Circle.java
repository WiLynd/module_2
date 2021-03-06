package ss6_inheritance.bai_tap;

class Circle {
    private double radius = 1.0;
    private String color = "blue";

    public Circle() {
    }

    public Circle(double radius,String color) {
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color=color;
    }

    public void setRadius(double radius) {
        this.radius=radius;
    }

    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = "
                + getRadius();
    }
}