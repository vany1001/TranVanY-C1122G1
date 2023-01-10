package org.example.bai7_AbstractClass_Interface.thuc_hanh.Animal_InterfaceEdible;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "chicken:o o o";
    }

    @Override
    public String howToEat() {
        return "could be fried" ;
    }
}
