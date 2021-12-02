package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array length: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("Min in Array: " + min);
    }
}
