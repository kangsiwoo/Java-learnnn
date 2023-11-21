package day7.chaptor12.ex03;

// 인터페이스는 구현안된 다양한 기능의 집합
interface A {
    void abc();
    default void bcd() {
        System.out.println("A 인터페이스의 bcd()");
    }
}

class B implements A {
    @Override
    public void abc() {
        System.out.println("B클래스의 ABC()");
    }
}

class C implements A {
    @Override
    public void abc() {
        System.out.println("C클래스의 ABC()");
    }
}

public class DefaultMethod {
    public static void main(String[] args) {

        A a1 = new B();
        A a2 = new C();

        a1.abc();
        a1.bcd(); // 이게 말이냐고!!!!!!!!!
        a2.abc();
        a2.bcd(); // 이게 말이냐고!!!!!!!!!

    }
}
