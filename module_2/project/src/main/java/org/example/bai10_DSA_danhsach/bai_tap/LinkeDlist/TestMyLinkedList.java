package org.example.bai10_DSA_danhsach.bai_tap.LinkeDlist;

public class TestMyLinkedList {

    public static void main(String[] args) {
        class Student {
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
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Tài");
        Student student2 = new Student(2, "Định");
        Student student3 = new Student(3, "Nghĩa");
        Student student4 = new Student(4, "Cường");
        Student student5 = new Student(5, "Phúc");
        Student student6 = new Student(6, "Thịnh");

        myLinkedList.addFirst(student1);
        myLinkedList.addLast(student2);
        myLinkedList.addLast(student3);
        myLinkedList.addLast(student4);
        myLinkedList.addLast(student5);
        myLinkedList.add(1,student6);

//
//        myLinkedList.remove(3);
        for (int i = 0; i < myLinkedList.size(); i++){
            Student student = (Student) myLinkedList.get(i);
            System.out.print(student.getId() + ": ");
            System.out.println(student.getName());
        }


//
//        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();
//
//        for (int i = 0; i < cloneLinkedList.size(); i++) {
//            Student student = (Student) cloneLinkedList.get(i);
//            System.out.println(student.getName());
//        }
//
//       System.out.println(myLinkedList.containst(student6));
//        System.out.println(myLinkedList.indexOf(student2));
    }

}
