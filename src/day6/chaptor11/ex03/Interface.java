package day6.chaptor11.ex03;

// An abstract class contains one or more abstract methods.
// interface means that all methods are abstract methods.

interface A {
    abstract void abc();
}
interface B {
    abstract void bcd();
}

class C {
    void abc() {}
}
class D extends C {} // When a class inherits from a class, overriding is optional.

class E implements A {
    @Override
    public void abc() {
        System.out.println("Classes that inherit from the interface should override it like this");
    }
}

abstract class F implements B {}

class G extends F {
    @Override
    public void bcd() {
        System.out.println("Eventually, some child overrode the abstract method.");
    }
}

// If I, the class, inherit an abstract method, I need to override it.
// Because a regular class can't have abstract methods.
// If you don't want to override them and pass them on to your children, you need to switch to an abstract class.

public class Interface {
}
