package dya4.chaptor9.ex02;

class A {
    // 필드의 종류에는 인스턴트 필드, 스태틱 필드(static이 붙은 필드)가 있다.
    // 인스턴트 필드
    int m = 3;

    // 스태틱 필드
    static int n = 5;

}

public class StaticField_1 {
    public static void main(String[] args) {
//        A a1 = new A();
//      인스턴트 필드 활용법 - 반드시 new A()를 통해 객체를 만들고 사용해야 함.
//        System.out.println(a1.m);


//      스태틱 필드 활용법 - new를 통해 객체를 만들 필요 없이 클래스명.필드명 으로 바로 사용 가능
//        System.out.println(A.n);


//        스태틱 필드도 객체를 생성해서 사용이 가능하기는 하다. 하지만 권장하지 않음.
        A a2 = new A();
        System.out.println(a2.n);

    }
}
