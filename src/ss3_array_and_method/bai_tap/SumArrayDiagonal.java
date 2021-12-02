package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class SumArrayDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array row & column: ");
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element [" + (i + 1) + "," + (j + 1) + "]: ");
                arr[i][j] = input.nextInt();
            }
        System.out.println("Array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i][i];
            }
        System.out.print("Sum Diagonal: " + sum);
    }
}
