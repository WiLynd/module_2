package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class ArrayElementDelete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array length: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        System.out.print("Input element you want to delete: ");
        int num = input.nextInt();
        if (checkElement(num, arr) != 0) {
            System.out.println("Before: ");
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            for (int i = checkElement(num, arr); i < arr.length-1; i++)
                arr[i] = arr[i + 1];
            arr[arr.length-1] = 0;
            System.out.println("After: ");
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
        } else
            System.out.println(num + " not in array.");
    }

    public static int checkElement(int n, int[] array) {
        int index = 0;
        int count = 0;
        while (count < array.length) {
            if (n == array[count]) {
                index = count;
                break;
            }
            count++;
        }
        return index;
    }
}