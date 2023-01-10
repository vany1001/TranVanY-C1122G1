package org.example.bai7_AbstractClass_Interface.bai_tap.InterfaceResizeable;



public class ResizeableMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("White", 8.5);
        shapes[1] = new Rectangle("Blue", 7, 8);
        shapes[2] = new Square("Black", 9);


        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Before resizeable " + ((Circle) shape).getArea());
                System.out.println("After resizeable " + ((Circle) shape).resize() +"\n");
            } else if (shape instanceof Rectangle) {
                System.out.println("Before resizeable " + ((Rectangle) shape).getArea());
                System.out.println("After resizeable " + ((Rectangle) shape).resize() + "\n");
            } else {
                System.out.println("Before resizeable " + ((Square) shape).getArea());
                System.out.println("After resizeable " + ((Square) shape).resize());
            }
        }
    }
}
