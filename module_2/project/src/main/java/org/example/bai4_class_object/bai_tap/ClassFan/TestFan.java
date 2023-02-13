package org.example.bai4_class_object.bai_tap.ClassFan;

public class TestFan {
    public static void main(String[] args) {

        Fan classFan1 = new Fan();
        Fan classFan2 = new Fan();

        classFan1.setSpeed(classFan1.FAST);
        classFan1.setRadius(10);
        classFan1.setColor("yellow");
        classFan1.setOn(true);
        classFan2.setSpeed(classFan2.MEDIUM);
        classFan2.setRadius(5);
        classFan2.setColor("Blue");
        classFan2.setOn(false);
        System.out.println(classFan2 + " và " + classFan1);

    }
}
