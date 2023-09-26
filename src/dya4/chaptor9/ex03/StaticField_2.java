package dya4.chaptor9.ex03;

class A {
//    instance field
    int m = 3;
//    static field
    static int n = 5;
}

public class StaticField_2 {
    public static void main(String[] args) {
//        객체를 두개 만들꺼야
        A a1 = new A();
        A a2 = new A();

//        인스턴스 필드
        a1.m = 5;
        a2.m = 6;

        System.out.println(a1.m);
        System.out.println(a2.m);

//        static field
        a1.n = 7;
        a2.n = 8;

//        비 권장
//        System.out.println(a1.n);
//        System.out.println(a2.n);

//        쌉 권장
        A.n = 9;
        System.out.println(a1.n);
        System.out.println(a2.n);
    }
}
