package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class InputElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array length: ");
        int n = input.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        System.out.print("Input element you want to insert: ");
        int num = input.nextInt();
        System.out.print("Input place you want to insert: ");
        int place = input.nextInt();
        if ((place >= 0) && (place<arr.length)) {
            arr = insert(arr, num, place);
            System.out.println("After");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        else {
            System.out.println("Can't insert!");
        }
    }

    public static int [] insert(int [] arr, int n, int p) {
        int [] tempArr = new int [arr.length + 1];
        for (int i = 0; i < p; i++)
            tempArr[i] = arr[i];
        for (int i = p+1; i < tempArr.length; i++)
            tempArr[i] = arr [i-1];
        tempArr[p] = n;
        return tempArr;
    }
}
