package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class ArrayCombine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array1 length: ");
        int n = input.nextInt();
        int [] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr1[i] = input.nextInt();
        }
        System.out.print("Input array2 length: ");
        n = input.nextInt();
        int [] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr2[i] = input.nextInt();
        }
        int [] arr3;
        arr3 = combineArray(arr1, arr2);
        System.out.println("After: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    public static int [] combineArray(int [] arr1, int [] arr2) {
        int [] tempArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            tempArr[i] = arr1[i];
        }
        for (int i = arr1.length; i < (arr1.length + arr2.length); i++) {
            tempArr[i] = arr2[i - arr1.length];
        }
        return tempArr;
    }
}