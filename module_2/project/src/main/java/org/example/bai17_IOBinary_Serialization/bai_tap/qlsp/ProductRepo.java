package org.example.bai17_IOBinary_Serialization.bai_tap.qlsp;

import org.example.bai17_IOBinary_Serialization.thuc_hanh.Student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepo implements IProductRepo {
    Scanner scanner = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();

    @Override
    public void add() {
        System.out.print("Nhập Mã sản phẩm: ");
        int productId = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String productName = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Nhập giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        productList.add(new Product(productId, productName, manufacturer, price));
        ReadWriteProduct.writeToFile(productList);

    }

    @Override
    public void display() {
        List<Product> result = ReadWriteProduct.readDataFromFile();
        for (Product product : result) {
            System.out.println(product);
        }

    }

    @Override
    public void search() {
        System.out.print("Nhập tên sản phẩm cần tìm: ");
        String nameSearch = scanner.nextLine();
        boolean isExit = false;
        List<Product> search = ReadWriteProduct.readDataFromFile();
        for (Product product : search) {
            if (product.getProductName().contains(nameSearch)) {
                System.out.println(product);
                isExit = true;
            }
        }
        if (!isExit) {
            System.out.println("Không tìm thấy");

        }
    }
}
