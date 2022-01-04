package thi_thu.service.impl;

import thi_thu.model.Student;
import thi_thu.service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentImpl implements StudentService {
    final String PATH = "D:\\CodeGym\\Module-2\\src\\thi_thu\\common\\data\\student.csv";
    static List<Student> studentList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        Student student = new Student();
        System.out.println("Nhap ma ID: ");
        student.setMaId(scanner.nextLine());
        System.out.println("Nhap ten hoc sinh: ");
        student.setHoTen(scanner.nextLine());
        System.out.println("Nhap ngay sinh: ");
        student.setNgaySinh(scanner.nextLine());
        System.out.println("Nhap gioi tinh: ");
        student.setGioiTinh(scanner.nextLine());
        System.out.println("Nhap lop: ");
        student.setLop(scanner.nextLine());
        System.out.println("Nhap diem so: ");
        student.setDiemSo(scanner.nextLine());
        display();
    }

    @Override
    public void display() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhap ma ID: ");
        String maId = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getMaId().equals(maId)) {
                studentList.remove(studentList.get(i));
            }
        }
    }

    @Override
    public void search() {
        System.out.println("Nhap ma ID: ");
        String maId = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getMaId().equals(maId)) {
                System.out.println(studentList.get(i));
            }
        }
    }
}
