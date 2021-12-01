package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class NumberReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập vào một số có 3 chữ số: ");
            n = input.nextInt();
        } while ((n>1000) || (n<0));

        int tr = n / 100;
        int ch = (n % 100) / 10;
        int dv = ((n % 100) % 10);

        if ((tr == 1) && (ch == 0) && (dv == 0))
            System.out.print("Một Trăm ");
        else if ((tr == 2) && (ch == 0) && (dv == 0))
            System.out.print("Hai Trăm ");
        else if ((tr == 3) && (ch == 0) && (dv == 0))
            System.out.print("Ba Trăm ");
        else if ((tr == 4) && (ch == 0) && (dv == 0))
            System.out.print("Bốn Trăm ");
        else if ((tr == 5) && (ch == 0) && (dv == 0))
            System.out.print("Năm Trăm ");
        else if ((tr == 6) && (ch == 0) && (dv == 0))
            System.out.print("Sáu Trăm ");
        else if ((tr == 7) && (ch == 0) && (dv == 0))
            System.out.print("Bảy Trăm ");
        else if ((tr == 8) && (ch == 0) && (dv == 0))
            System.out.print("Tám Trăm ");
        else if ((tr == 9) && (ch == 0) && (dv == 0))
            System.out.print("Chín Trăm ");

        else if ((tr == 0) && (ch == 1) && (dv == 0))
            System.out.print("Mười ");
        else if ((tr == 0) && (ch == 2) && (dv == 0))
            System.out.print("Hai Mươi ");
        else if ((tr == 0) && (ch == 3) && (dv == 0))
            System.out.print("Ba Mươi ");
        else if ((tr == 0) && (ch == 4) && (dv == 0))
            System.out.print("Bốn Mươi ");
        else if ((tr == 0) && (ch == 5) && (dv == 0))
            System.out.print("Năm Mươi ");
        else if ((tr == 0) && (ch == 6) && (dv == 0))
            System.out.print("Sáu Mươi ");
        else if ((tr == 0) && (ch == 7) && (dv == 0))
            System.out.print("Bảy Mươi ");
        else if ((tr == 0) && (ch == 8) && (dv == 0))
            System.out.print("Tám Mươi ");
        else if ((tr == 0) && (ch == 9) && (dv == 0))
            System.out.print("Chín Mươi ");

        else if ((tr == 0) && (ch == 0) && (dv == 0))
            System.out.print("Không ");
        else if ((tr == 0) && (ch == 0) && (dv == 1))
            System.out.print("Một ");
        else if ((tr == 0) && (ch == 0) && (dv == 2))
            System.out.print("Hai ");
        else if ((tr == 0) && (ch == 0) && (dv == 3))
            System.out.print("Ba ");
        else if ((tr == 0) && (ch == 0) && (dv == 4))
            System.out.print("Bốn ");
        else if ((tr == 0) && (ch == 0) && (dv == 5))
            System.out.print("Năm ");
        else if ((tr == 0) && (ch == 0) && (dv == 6))
            System.out.print("Sáu ");
        else if ((tr == 0) && (ch == 0) && (dv == 7))
            System.out.print("Bảy ");
        else if ((tr == 0) && (ch == 0) && (dv == 8))
            System.out.print("Tám ");
        else if ((tr == 0) && (ch == 0) && (dv == 9))
            System.out.print("Chín ");

        else {
            switch (tr) {
                case 1:
                    System.out.print("Một Trăm ");
                    break;
                case 2:
                    System.out.print("Hai Trăm ");
                    break;
                case 3:
                    System.out.print("Ba Trăm ");
                    break;
                case 4:
                    System.out.print("Bốn Trăm ");
                    break;
                case 5:
                    System.out.print("Năm Trăm ");
                    break;
                case 6:
                    System.out.print("Sáu Trăm ");
                    break;
                case 7:
                    System.out.print("Bảy Trăm ");
                    break;
                case 8:
                    System.out.print("Tám Trăm ");
                    break;
                case 9:
                    System.out.print("Chín Trăm ");
                    break;
            }
            switch (ch) {
                case 0:
                    System.out.print("Lẻ ");
                    break;
                case 1:
                    System.out.print("Mười ");
                    break;
                case 2:
                    System.out.print("Hai Mươi ");
                    break;
                case 3:
                    System.out.print("Ba Mươi ");
                    break;
                case 4:
                    System.out.print("Bốn Mươi ");
                    break;
                case 5:
                    System.out.print("Năm Mươi ");
                    break;
                case 6:
                    System.out.print("Sáu Mươi ");
                    break;
                case 7:
                    System.out.print("Bảy Mươi ");
                    break;
                case 8:
                    System.out.print("Tám Mươi ");
                    break;
                case 9:
                    System.out.print("Chín Mươi ");
                    break;
            }
            switch (dv) {

                case 1:
                    System.out.print("Một ");
                    break;
                case 2:
                    System.out.print("Hai ");
                    break;
                case 3:
                    System.out.print("Ba ");
                    break;
                case 4:
                    System.out.print("Bốn ");
                    break;
                case 5:
                    System.out.print("Năm ");
                    break;
                case 6:
                    System.out.print("Sáu ");
                    break;
                case 7:
                    System.out.print("Bảy ");
                    break;
                case 8:
                    System.out.print("Tám ");
                    break;
                case 9:
                    System.out.print("Chín");
                    break;
            }
        }
    }
}
