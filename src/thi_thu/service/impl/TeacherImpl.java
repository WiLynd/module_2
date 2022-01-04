package thi_thu.service.impl;

import thi_thu.model.Teacher;
import thi_thu.service.TeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherImpl implements TeacherService {
    final String PATH = "D:\\CodeGym\\Module-2\\src\\thi_thu\\common\\data\\teacher.csv";
    static List<Teacher> teacherList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Teacher teacher = new Teacher();
        System.out.println("Nhap ma ID: ");
        teacher.setMaId(scanner.nextLine());
        System.out.println("Nhap ten giang vien: ");
        teacher.setHoTen(scanner.nextLine());
        System.out.println("Nhap ngay sinh: ");
        teacher.setNgaySinh(scanner.nextLine());
        System.out.println("Nhap gioi tinh: ");
        teacher.setGioiTinh(scanner.nextLine());
        System.out.println("Nhap chuyen mon: ");
        teacher.setChuyenMon(scanner.nextLine());
    }

    @Override
    public void display() {
        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println(teacherList.get(i).toString());
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhap ma ID: ");
        String maId = scanner.nextLine();
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getMaId().equals(maId)) {
                teacherList.remove(teacherList.get(i));
            }
        }
    }

    @Override
    public void search() {
        System.out.println("Nhap ma ID: ");
        String maId = scanner.nextLine();
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getMaId().equals(maId)) {
                System.out.println(teacherList.get(i));
            }
        }
    }
}
