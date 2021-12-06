package ss4_oop.bai_tap;

import java.util.Scanner;

public class InputQuadraticEquation {
    public static void main(String[] args) {
        double a,b,c;
        System.out.print("Enter a,b,c: ");
        Scanner input = new Scanner(System.in);
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        if(qe.getDiscriminant()<0) System.out.print("The equation has no roots");
        else if(qe.getDiscriminant()==0) System.out.print("The equation has one root: "+qe.getRoot1());
        else{
            System.out.println("The equation has two roots: ");
            System.out.println("Delta is: "+qe.getDiscriminant());
            System.out.println("Root1 is: "+qe.getRoot1());
            System.out.println("Root2 is: "+qe.getRoot2());
        }
    }
}
