package org.example.bai5_access_modifier.bai_tap.ClassJustWrite;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        Student.setName("Y");
        Student.setClasses("C11");
        System.out.println(student.toString());
    }
}
