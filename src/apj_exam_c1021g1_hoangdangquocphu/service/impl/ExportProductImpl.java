package apj_exam_c1021g1_hoangdangquocphu.service.impl;

import apj_exam_c1021g1_hoangdangquocphu.model.ExportProduct;
import apj_exam_c1021g1_hoangdangquocphu.service.ExportProductService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExportProductImpl implements ExportProductService {
    public static final String FileExportProduct = "D:\\CodeGym\\Module-2\\src\\apj_exam_c1021g1_hoangdangquocphu\\data\\ExportProduct.csv";
    static List<ExportProduct> exportProductList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("Input product ID: ");
        String productId = scanner.nextLine();
        System.out.println("Input product code: ");
        String productCode = scanner.nextLine();
        System.out.println("Input product name: ");
        String productName = scanner.nextLine();
        System.out.println("Input product cost: ");
        String productCost = scanner.nextLine();
        System.out.println("Input product number: ");
        String productNumber = scanner.nextLine();
        System.out.println("Input product producer: ");
        String productProducer = scanner.nextLine();
        System.out.println("Input product export cost: ");
        String productExportCost = scanner.nextLine();
        System.out.println("Input product export location: ");
        String productExportLocation = scanner.nextLine();

        ExportProduct exportProduct = new ExportProduct(productId, productCode, productName, productCost, productNumber, productProducer, productExportCost, productExportLocation);
        exportProductList.add(exportProduct);
        writeFileProduct(FileExportProduct, exportProductList);
    }

    @Override
    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input code product you want to delete");
        String codeForDelete = sc.nextLine();
        for (int i = 0; i < exportProductList.size(); i++) {
            if (codeForDelete.equals(exportProductList.get(i).getProductCode())) {
                System.out.println("Do you want delete this product? (Yes/No)");
                String option = sc.nextLine();
                if (option.equals("Yes")) {
                    exportProductList.remove(i);
                } else {
                    continue;
                }
            }
        }
    }

    @Override
    public void display() {
        for (ExportProduct exportProducts : exportProductList) {
            System.out.println(exportProducts.toString());
        }
    }

    @Override
    public void search() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Search by code product: ");
            System.out.println("2.Search by name product: ");
            System.out.println("3.Exit");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    searchByCode();
                    break;
                case 2:
                    searchByName();
                    break;
                case 3:
                    System.exit(0);

            }
        } while (true);
    }

    public static void searchByCode() {
        System.out.println("Input code product you want to search: ");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        for (int i = 0; i < exportProductList.size(); i++) {
            if (search.equals(exportProductList.get(i).getProductCode())) {
                System.out.println(exportProductList.get(i).toString());
            }
        }
    }

    public static void searchByName() {
        System.out.println("Input name product you want to search: ");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        for (int i = 0; i < exportProductList.size(); i++) {
            if (search.equals(exportProductList.get(i).getProductName())) {
                System.out.println(exportProductList.get(i).toString());
            }
        }
    }

    public static void writeFileProduct(String filepath, List<ExportProduct> exportProductList) {
        try {
            FileWriter fileWriter = new FileWriter(filepath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (ExportProduct exportProduct : exportProductList) {
                bufferedWriter.write(exportProduct.getProductId() + ","
                        + exportProduct.getProductCode() + ","
                        + exportProduct.getProductName() + ","
                        + exportProduct.getProductCost() + ","
                        + exportProduct.getProductNumber() + ","
                        + exportProduct.getProductProducer() + ","
                        + exportProduct.getExportCost()
                        + exportProduct.getExportLocation() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
