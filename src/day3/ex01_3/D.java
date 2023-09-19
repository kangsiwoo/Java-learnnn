package day3.ex01_3;

import day3.chapter9.ex01_1.A;

// D extends A를 했다는 것은 A가 부모 클래스, D가 A의 자식 클래스가 된다.
// 그래서 자식은 부모의 모든것을 받기 때문에 this. 이 가능하다. (하지만 필드나 변수에 protected가 있거나 생성자를 호출하지 않았을때는 필수이다.)
public class D extends A {
    public void print() {
//        자식클래스는 private 빼고는 사용할 수 있다.
        System.out.print(this.a + " ");
        System.out.print(this.b + " ");
//        System.out.println(this.c + " ");
//        System.out.println(this.d + " ");
        System.out.println();
    }
}
