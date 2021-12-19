package ss11_dsa_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class CircularQueue {
    public static void main(String[] args) {
        Integer number;
        Stack<Integer> stack = new Stack<>();
        String result = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thập phân");
        number = scanner.nextInt();
        while (number!=0){
            stack.push(number%2);
            number/=2;
        }
        while (!stack.empty()){
            result += stack.pop();
        }
        System.out.println("Hệ nhị phân: " +result);
    }
}
