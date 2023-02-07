package org.example.bai17_IOBinary_Serialization.bai_tap.qlsp;

import java.util.Scanner;

public class ProductMenu {
    public static void menu(){
        IProductRepo iProductRepo = (IProductRepo) new ProductRepo();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("----------Product Manager------------");
            System.out.println("1.Add Product");
            System.out.println("2.List Product");
            System.out.println("3.SeachId Product");
            System.out.println("4.Exit");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    iProductRepo.add();
                    break;
                case 2:
                    iProductRepo.display();
                    break;
                case 3:
                    iProductRepo.search();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("");
            }
        } while (true);



    }
}
