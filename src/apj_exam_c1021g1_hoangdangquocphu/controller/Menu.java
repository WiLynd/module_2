package apj_exam_c1021g1_hoangdangquocphu.controller;

import apj_exam_c1021g1_hoangdangquocphu.model.ExportProduct;
import apj_exam_c1021g1_hoangdangquocphu.model.ImportProduct;
import apj_exam_c1021g1_hoangdangquocphu.service.impl.ExportProductImpl;
import apj_exam_c1021g1_hoangdangquocphu.service.impl.ImportProductImpl;

import java.util.Scanner;

public class Menu {
    public static void displayMenu() {
        do {
            System.out.println("------------------MenuProduct------------------");
            System.out.println("1.Export Product");
            System.out.println("2.Import Product");
            System.out.println("3.Exit");
            System.out.println("Choose your option");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    MenuExportProduct();
                    break;
                case 2:
                    MenuImportProduct();
                    break;
                case 3:
                    System.out.println("System Exit ");
                    System.exit(0);
                    break;
            }
        } while (true);
    }
    public static void MenuExportProduct(){
        ExportProductImpl exportProduct = new ExportProductImpl();
        do {
            System.out.println("1.Add new product");
            System.out.println("2.Delete product");
            System.out.println("3.Display list product");
            System.out.println("4.Search product");
            System.out.println("5.Back to main menu");
            System.out.println("Please choose your option");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    exportProduct.add();
                    break;
                case 2:
                    exportProduct.delete();
                    break;
                case 3:
                    exportProduct.display();
                    break;
                case 4:
                    exportProduct.search();
                case 5:
                    displayMenu();
                    break;
            }
        }while (true);
    }
    public static void MenuImportProduct(){
        ImportProductImpl importProduct = new ImportProductImpl();
        do {
            System.out.println("1.Add new product");
            System.out.println("2.Delete Product");
            System.out.println("3.Display list product");
            System.out.println("4.Search product");
            System.out.println("5.Back to main menu");
            System.out.println("Please choose your option");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    importProduct.add();
                    break;
                case 2:
                    importProduct.delete();
                    break;
                case 3:
                    importProduct.display();
                    break;
                case 4:
                    importProduct.search();
                case 5:
                    displayMenu();
                    break;
            }
        }while (true);
    }
}
