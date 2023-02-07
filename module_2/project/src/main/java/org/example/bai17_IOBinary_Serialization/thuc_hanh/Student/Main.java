package org.example.bai17_IOBinary_Serialization.thuc_hanh.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String FILE_PATH = "D:\\codegym\\TranVanY-C1122G1\\module_2\\project\\src\\main\\java\\org\\example\\bai17_IOBinary_Serialization\\thuc_hanh\\Student\\Student.dat";

    public static void writeToFile(List<Student> studentList) {
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

    public static List<Student> readDataFromFile() {
            List<Student> studentList = new ArrayList<>();
//        List<Student> studentList;
        try {
            FileInputStream fis = new FileInputStream(FILE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentList = (List<Student>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return studentList;

    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile(students);
        List<Student> studentDataFromFile = readDataFromFile();
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }


}
