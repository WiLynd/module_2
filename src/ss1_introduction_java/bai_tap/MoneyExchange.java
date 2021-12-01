package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class MoneyExchange {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD: ");
        usd = scanner.nextDouble();
        double exchange = usd*vnd;
        System.out.println("Quy đổi: "+ exchange +" vnđ");
    }
}
