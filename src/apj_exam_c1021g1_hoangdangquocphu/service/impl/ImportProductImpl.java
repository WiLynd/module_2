package apj_exam_c1021g1_hoangdangquocphu.service.impl;

import apj_exam_c1021g1_hoangdangquocphu.model.ImportProduct;
import apj_exam_c1021g1_hoangdangquocphu.service.ImportProductService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportProductImpl implements ImportProductService {
    public static final String FileImportProduct = "D:\\CodeGym\\Module-2\\src\\apj_exam_c1021g1_hoangdangquocphu\\data\\ImportProduct.csv";
    static List<ImportProduct> importProductList = new ArrayList<>();
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
        System.out.println("Input product import cost: ");
        String productImportCost = scanner.nextLine();
        System.out.println("Input product import location: ");
        String productImportLocation = scanner.nextLine();
        System.out.println("Input product import tax: ");
        String productImportTax = scanner.nextLine();

        ImportProduct importProduct = new ImportProduct(productId, productCode, productName, productCost, productNumber, productProducer, productImportCost, productImportLocation, productImportTax);
        importProductList.add(importProduct);
        writeFileProduct(FileImportProduct, importProductList);
    }

    @Override
    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input code product you want to delete");
        String codeForDelete = sc.nextLine();
        for(int i = 0 ; i < importProductList.size() ; i++){
            if(codeForDelete.equals(importProductList.get(i).getProductCode())){
                System.out.println("Do you want delete this product? (Yes/No)");
                String option = sc.nextLine();
                if(option.equals("Yes")){
                    importProductList.remove(i);
                }else{
                    continue;
                }
            }
        }
    }

    @Override
    public void display() {
        for (ImportProduct importProduct : importProductList) {
            System.out.println(importProduct.toString());
        }
    }

    @Override
    public void search() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1:Search by code product");
            System.out.println("2.Search by name product");
            System.out.println("3.Exit");
            int choose = sc.nextInt();
            switch (choose){
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
    public static void searchByCode(){
        System.out.println("Input code product you want to search");
        Scanner sc = new Scanner(System.in);
        String search = sc.nextLine();
        for(int i = 0 ; i < importProductList.size() ; i++){
            if(search.equals(importProductList.get(i).getProductCode())){
                importProductList.get(i).toString();
            }
        }
    }

    public static void searchByName(){
        System.out.println("Input name product you want to search");
        Scanner sc = new Scanner(System.in);
        String search = sc.nextLine();
        for (int i = 0 ; i < importProductList.size() ; i++){
            if(search.equals(importProductList.get(i).getProductName())){
                importProductList.get(i).toString();
            }
        }
    }
    public static void writeFileProduct(String filepath, List<ImportProduct> importProductList) {
        try {
            FileWriter fileWriter = new FileWriter(filepath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (ImportProduct importProduct : importProductList) {
                bufferedWriter.write(importProduct.getProductId() + ","
                        + importProduct.getProductCode() + ","
                        + importProduct.getProductName() + ","
                        + importProduct.getProductCost() + ","
                        + importProduct.getProductNumber() + ","
                        + importProduct.getProductProducer() + ","
                        + importProduct.getImportCost() + ","
                        + importProduct.getImportLocation() + ","
                        + importProduct.getImportTax() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
