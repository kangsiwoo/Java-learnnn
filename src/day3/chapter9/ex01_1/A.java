package day3.chapter9.ex01_1;

public class A {
    public A() {

    }

//    필드와 메서드 앞에 올 수있는 4가지 '접근 지정'
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;
    public void print() {
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        System.out.print(d + " ");
        System.out.println();
    }
}
