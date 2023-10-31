package day06.chaptor11.ex01;

// final can be placed before fields, methods, and classes.
// A final field must store its value when first declared and cannot be changed later.
// Final methods cannot be overridden by children.
// A final class can no longer be inherited by other classes.


class A {
    int a = 3;
    final int b = 5;

    void abc() {};
    final void bcd() {};
}

class B extends A {
// void bcd() {}; Final methods cannot be overridden by children.
}

final class C {}

//class D extends C {} final class cannot be inheritance

public class FinalModifier {
    public static void main(String[] args) {
        A a = new A();
        a.a = 10;
//        a.b = 20; final fields cannot be changed
    }
}
