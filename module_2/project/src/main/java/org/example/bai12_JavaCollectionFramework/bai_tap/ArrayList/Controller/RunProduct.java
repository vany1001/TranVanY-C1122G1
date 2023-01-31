package org.example.bai12_JavaCollectionFramework.bai_tap.ArrayList.Controller;

import org.example.bai12_JavaCollectionFramework.bai_tap.ArrayList.Product;
import org.example.bai12_JavaCollectionFramework.bai_tap.ArrayList.Service.ProductSer;

import java.util.Scanner;

public class RunProduct {
        public static void main(String[] args) {
            System.out.println("Quản lý sản phẩm ");
            Scanner scanner = new Scanner(System.in);
            ProductSer productSer = new ProductSer();
            System.out.println("Cập Nhập sản phẩm :");
            int select = 0;
            do {
                System.out.println("-----Product Manager-------");
                System.out.println("1. List");
                System.out.println("2. Add");
                System.out.println("3. Update id");
                System.out.println("4. Remove id");
                System.out.println("5. Seach id");
                System.out.println("6. Sort");
                System.out.println("7. Exit");
                select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        productSer.display(

                        );
                        break;
                    case 2:
                        System.out.println("Input  id");
                        int ID = Integer.parseInt(scanner.nextLine());
                        System.out.println("Input name");
                        String name = scanner.nextLine();
                        System.out.println("Input price product");
                        int price = Integer.parseInt(scanner.nextLine());
                        Product product = new Product(ID, name, price);
                        productSer.add(product);
                        break;
                    case 3:
                        System.out.println("Input id product");
                        int seachId = Integer.parseInt(scanner.nextLine());
                        Product product1 = productSer.findById(seachId);
                        if (product1 != null) {
                            System.out.println("Input names product");
                            String newName = scanner.nextLine();
                            System.out.println("Input price product");
                            int newPrice = Integer.parseInt(scanner.nextLine());
                            product1.setName(newName);
                            product1.setPrice(newPrice);
                            productSer.update(product1);
                        }
                        break;
                    case 4:
                        System.out.println("input id remove");
                        int seachIdRemove = Integer.parseInt(scanner.nextLine());
                        Product product2 =productSer.findById(seachIdRemove);
                        if (product2 !=null){
                            productSer.remove(product2);
                        }
                        else {
                            System.out.println("Không tìm thấy id bạn tìm kiếm");
                        }
                        break;
                    case 5:
                        System.out.println("input id seach");
                        int seachID=Integer.parseInt(scanner.nextLine());
                        Product product3 =productSer.findById(seachID);
                        if (product3 !=null){
                            productSer.seachId(product3);
                        }
                        break;
                    case 6:
                        productSer.sort();
                        break;
                    default:
                        System.err.println("Vui lòng nhập lại");

                }
            } while (true);
        }
}
