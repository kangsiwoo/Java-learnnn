package day2.day_2__chapter7.ch10;

class A {
//    텅 비어있음
    A() {
        this(10);
        System.out.println("첫번째 생성자");

    }
//    또다른 생성자 생성 가능 : 오버로딩이 가능하기 때문에
    A(int a) {
        System.out.println("두번째 생성자 : " + a);
    }
//    this.  : 지역변수가 아닌 필드를 가리킬 때 사용
//    this() : 자신외의 또 다른 생성자를 호풀할 때 사용
}

public class ThisMethod {
    public static void main(String[] args) {
        A a = new A();
    }
}
