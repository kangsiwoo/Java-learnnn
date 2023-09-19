package day2.day_2__chapter7.ch08;

// 클래스에는 필드와 메서드 뿐만 아니라 생성자라는 것이 존제한다.
// 생성자는 new~를 통해서 객체 새체 생성을 가능하게 해주는 존재이다.
// 필. 수. 요소이기 때문에 없어서는 안되며, 개발자가 생성자를 넣지 않았다면 컴파일러가 대신 넣어준다.
class A {
    int m;
    void work() {
        System.out.println(m);
    }
//    컴파일러가 생성자가 대신 넣어줄 예정
}


class B {
    int m;
    void work() {
        System.out.println(m);
    }
//    이게 바로 생성자(Default 생성자)이다.
//    Default생성자를 직접 넣어줌
    B() { // 생성자 이름은 클래스 이름과 같아야 한다.

    }
}

class C {
    int m;
    void work() {
        System.out.println(m);
    }
//    이런 식으로 매개변수가 들어간 생성자도 정의할 수 있다.
//    단 이런 경우에 컴파일러가 Default 생성자를 추가 안한다.
    C(int a) {
        m = a;
    }

    C() {

    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        A a = new A(); // 생성자로 객체 생성하기
        B b = new B();
        C c = new C(1);
    }
}
