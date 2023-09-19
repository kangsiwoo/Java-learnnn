package day3.chapter9.ex01_1;

public class B {
    public void print() {
//        A클래스의 객체를 생성
        A a = new A();

        System.out.print(a.a + " ");
        System.out.print(a.b + " ");
        System.out.print(a.c + " ");
//    아하 private라고 되어있으면 같은 클래스 파일 안에서만 사용 가능하구나
//        System.out.print(a.d + " ");
        System.out.println();
    }
}
