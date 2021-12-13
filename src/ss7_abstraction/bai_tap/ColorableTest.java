package ss7_abstraction.bai_tap;

public class ColorableTest {
    public static void main(String[] args) {
        Shape []shape=new Shape[3];
        shape[0] = new Circle(1.0,"red",true);
        shape[1] = new Rectangle(2.0,3.0,"blue",true);
        shape[2] = new Square(3.0,"yellow",true);

        for(Shape check:shape) {
            System.out.println(check);
            if (check instanceof Colorable) {
                ((Colorable)check).howToColor();
            }
        }
    }
}