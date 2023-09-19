package day3.chapter9.ex01_2;

import day3.chapter9.ex01_1.A;
import day3.chapter9.ex01_1.B;
import day3.ex01_3.C;
import day3.ex01_3.D;
// 실제 개발할 때는 protected와 default는 잘 사용 안하고
// 가리고 싶으면 private 아니면 public을 자주 사용한다.
public class AccessModifierOfMember {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.print();
        b.print();
        c.print();
        d.print();
    }
}
