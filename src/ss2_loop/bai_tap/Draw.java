package ss2_loop.bai_tap;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int choice = -1;
        int width,height;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    System.out.print("Input height: ");
                    height = input.nextByte();
                    System.out.print("Input width: ");
                    width = input.nextByte();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++)
                            System.out.print("* ");
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("1: top-left");
                    System.out.println("2: top-right");
                    System.out.println("3: bottom-left");
                    System.out.println("4: bottom-right");
                    System.out.print("Choose angle: ");
                    byte triangleChoice = input.nextByte();
                    System.out.print("Input height: ");
                    height = input.nextByte();
                    switch (triangleChoice) {
                        case 1:
                            for (int i = 1; i <= height; i++) {
                                for (int j = height; j >= i; j--)
                                    System.out.print(" *");
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int i = 1; i <= height; i++) {
                                for (int j = 0; j <= i - 1; j++)
                                    System.out.print("  ");
                                for (int k = height; k >= i; k--)
                                    System.out.print(" *");
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int i = 1; i <= height; i++) {
                                for (int j = 1; j <= i; j++)
                                    System.out.print(" *");
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (int i = 1; i <= height; i++) {
                                for (int k = height; k >= i; k--)
                                    System.out.print("  ");
                                for (int j = 0; j <= i - 1; j++)
                                    System.out.print(" *");
                                System.out.println();
                            }
                            break;
                    }
                case 3:
                    System.out.println("Draw the isosceles triangle");
                    System.out.print("Input height: ");
                    height = input.nextByte();
                    for (int i = 1; i <= height; i++) {
                        for (int j = height/2+1; j >= i-1; j--)
                            System.out.print("  ");
                        for (int k = 1; k <= i; k++)
                            System.out.print(" *");
                        for (int l = 1; l <= i-1; l++)
                            System.out.print(" *");
                        System.out.println();
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
