package thi_thu.controller;

import thi_thu.service.impl.StudentImpl;
import thi_thu.service.impl.TeacherImpl;

import java.util.Scanner;

public class Menu {
    public void displayMenu() {
        StudentImpl studentImpl = new StudentImpl();
        TeacherImpl teacherImpl = new TeacherImpl();
        int choice = 0;
        int choice1;
        Scanner scanner = new Scanner(System.in);

        while (choice !=5) {
            System.out.println("--CHUONG TRINH QUAN LY SINH VIEN--");
            System.out.println("Chon chuc nang:");
            System.out.println("1. Them giang vien hoac hoc sinh.");
            System.out.println("2. Xoa giang vien hoac hoc sinh.");
            System.out.println("3. Xem danh sach giang vien hoac hoc sinh.");
            System.out.println("4. Tim kiem giang vien hoac hoc sinh.");
            System.out.println("5. Thoat.");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("================================");
                    System.out.println("1. Giang vien.");
                    System.out.println("2. Hoc sinh.");
                    choice1 = scanner.nextInt();
                    if (choice1 == 1) {
                        teacherImpl.add();
                    }
                    else studentImpl.add();
                    System.out.println("================================");
                    break;
                case 2:
                    System.out.println("================================");
                    System.out.println("1. Giang vien.");
                    System.out.println("2. Hoc sinh.");
                    choice1 = scanner.nextInt();
                    if (choice1 == 1) {
                        teacherImpl.delete();
                    }
                    else studentImpl.delete();
                    System.out.println("================================");
                    break;
                case 3:
                    System.out.println("================================");
                    System.out.println("1. Giang vien.");
                    System.out.println("2. Hoc sinh.");
                    choice1 = scanner.nextInt();
                    if (choice1 == 1) {
                        teacherImpl.display();
                    }
                    else studentImpl.display();
                    System.out.println("================================");
                    break;
                case 4:
                    System.out.println("================================");
                    System.out.println("1. Giang vien.");
                    System.out.println("2. Hoc sinh.");
                    choice1 = scanner.nextInt();
                    if (choice1 == 1) {
                        teacherImpl.search();
                    }
                    else studentImpl.search();
                    System.out.println("================================");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap lai.");
                    break;
            }
        }
    }
}
