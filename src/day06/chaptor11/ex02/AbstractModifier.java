package day06.chaptor11.ex02;

// Abstract : 추상적
// If any of the methods in the class has an abstract method
// The class must be declared as an abstract class.

// abstract method is a method whose functionality has not been defined yet
// So who defines that function and when?
// Must be defined when a child inherits

import javax.print.Doc;

abstract class Animal {
    abstract void cry(); // Howling sounds vary depending on the animal
}

class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("야옹");
    }
}

class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

public class AbstractModifier {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.cry();

        Animal dog = new Dog();
        dog.cry();
    }
}
