package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array x: ");
        int n = input.nextInt();
        System.out.print("Input array y: ");
        int m = input.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element [" + (i + 1) + "," + (j + 1) + "]: ");
                arr[i][j] = input.nextInt();
            }
        System.out.println("Array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Max in Array: " + max(arr, n, m));
    }

    public static int max(int[][] arr, int n, int m) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        return max;
    }
}