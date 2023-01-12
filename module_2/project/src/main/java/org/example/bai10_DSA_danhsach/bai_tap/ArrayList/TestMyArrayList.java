package org.example.bai10_DSA_danhsach.bai_tap.ArrayList;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Tín");
        Student b = new Student(2, "Định");
        Student c = new Student(3, "Nghĩa");
        Student d = new Student(4, "Minh");
        Student e = new Student(5, "Phúc");
        Student f = new Student(6, "Ý");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        studentMyArrayList.add(f);
        studentMyArrayList.size();

        for (int i = 0; i < studentMyArrayList.size(); i++){
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.print(student.getId() + ": ");
            System.out.println(student.getName());
        }
//
//        System.out.println(studentMyArrayList.size());
//        System.out.println(studentMyArrayList.get(2).getName());
//
//        System.out.println(studentMyArrayList.indexOf(d));
//        System.out.println(studentMyArrayList.contains(f));

//        newMyArrayList = studentMyArrayList.clone();
//        Student student = newMyArrayList.remove(4);
//        System.out.println(student.getName());
//
    }
}
