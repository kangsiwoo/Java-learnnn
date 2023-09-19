package day3.chapter8.ex01_02;

import day3.chapter8.ex01_01.A;

// 이클래스는 public 클래스이기 때문에 다른 패키지에서 사용할 수 있다.
public class PackageImport {
    public static void main(String[] args) {
        A a = new A();
        a.print();
    }
}
