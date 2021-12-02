package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        char ch;
        int count = 0;
        System.out.print("Input string: ");
        str = input.nextLine();
        System.out.print("Input character: ");
        ch = input.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                count++;
        }
        System.out.println("Count: " + count);
    }
}
