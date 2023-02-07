package org.example.bai17_IOBinary_Serialization.bai_tap.qlsp;

import org.example.bai17_IOBinary_Serialization.thuc_hanh.Student.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteProduct {

    private static final String FILE_PATH = "D:\\codegym\\TranVanY-C1122G1\\module_2\\project\\src\\main\\java\\org\\example\\bai17_IOBinary_Serialization\\bai_tap\\qlsp\\product.dat";

    public static void writeToFile(List<Product> studentList) {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(studentList);
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Product> readDataFromFile() {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(FILE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }

    public static void main(String[] args) {
        ProductMenu.menu();

    }
}
