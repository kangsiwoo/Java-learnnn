package dya4.chaptor9.ex05;

class A {
    int a;
    static int b;

//    생성(생성자는 주로 인스턴스 필드를 초기화 함.)
//    static 필드도 생성자에서 초기화가 되긴한다. (하지만 권장하지 않음.)
    A(int a) {
        this.a = a;
//        b = 7; - 비권장
    }

    static {
//        쌉 권장
        b = 7;
    }
}

public class StaticInitialBlock {
    public static void main(String[] args) {
        A a1 = new A(3);
        System.out.println(a1.a);
        System.out.println(A.b);
    }
}
