package ss6_inheritance.bai_tap;

import java.util.Scanner;

public class ShapeAndTriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1,side2,side3;
        String color;
        System.out.print("Please enter the color of triangle: ");
        color = input.nextLine();

        while (true)
        {
            System.out.print("Please enter the first side: ");
            side1=input.nextDouble();
            System.out.print("Please enter the second side: ");
            side2=input.nextDouble();
            System.out.print("Please enter the third side: ");
            side3=input.nextDouble();
            if (side1<0 || side2<0 || side3<0) {
                System.out.println("Your triangle is not existed. Please enter again!");
                continue;
            }
            else if(side1+side2<=side3 || side1+side3<=side2 || side2+side3<=side1) {
                System.out.println("Your triangle is not existed. Please enter again!");
                continue;
            }
            break;
        }
        Shape s1 = new Triangle(side1,side2,side3,color);
        System.out.println(s1);
    }
}
