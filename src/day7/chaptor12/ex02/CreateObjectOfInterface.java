package day7.chaptor12.ex02;

interface A {
    int a = 3;
    void abc(); // 추상메서드임
}

// 근데 클래스 B정의하는거 귀찮음
//class B implements A {
//    @Override
//    public void abc() {
//        System.out.println("B가 책임지고 오버라이딩 했다.");
//    }
//}

public class CreateObjectOfInterface {
    public static void main(String[] args) {
//        A a1 = new A(); // 인터페이스는 곧바로 new해서 객체를 생성할 수 없다.
//        귀찮으니까 이렇게 하자
        A a1 = new A() {
            @Override
            public void abc() {
                System.out.println("어따 편하다.");
            }
        };

        System.out.println(a1.a);
        a1.abc();
    }
}
