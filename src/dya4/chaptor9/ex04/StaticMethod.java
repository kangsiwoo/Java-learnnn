package dya4.chaptor9.ex04;

class A {
//    instance method
    void abc() {
        System.out.println("instance method");
    }

//    static method
    static void bcd() {
        System.out.println("static method");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
//        instance method - 반드시 객체를 만들어야함
        A a1 = new A();
        a1.abc();

//        static method - 클래스 명으로 바로 접근 가능

//        비 추천
        A a2 = new A();
        a2.bcd();

//        쌉 추천
        A.bcd();
    }
}
