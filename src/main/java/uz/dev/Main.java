package uz.dev;

import uz.dev.model.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DatabaseService databaseService = new DatabaseService();
        int i = -1;

        while (i != 0){
            System.out.println("1 -> PC list, 2 -> Laptop list, 3 -> Printer list, 4 -> Add Product");
            i = scanner.nextInt();
            switch (i){
                case 1:
                    scanner = new Scanner(System.in);
                    System.out.println("Enter PC min price");
                    Float minPrice = scanner.nextFloat();
                    System.out.println("Enter PC max price");
                    Float maxPrice = scanner.nextFloat();
                    databaseService.getPcec(minPrice, maxPrice);
                    break;

                case 2:
                    databaseService.getLaptops();
                    break;

                case 3:
                    databaseService.getPrinters();
                    break;
                case 4:
                    scanner = new Scanner(System.in);
                    System.out.println("Enter product maker");
                    String maker = scanner.nextLine();
                    System.out.println("Enter product model");
                    String model = scanner.nextLine();
                    System.out.println("Enter product type");
                    String type = scanner.nextLine();

                    Product product = new Product(maker, model, type);
                    databaseService.saveUserPreparedStatement(product);
                    break;
            }
        }

    }

}
