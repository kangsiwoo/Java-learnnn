package day2.day_2__chapter7.ch01;

class A {
    // 필드 정의
    int m = 3;
    int n = 4;

    // 메서드 정의
    void work1() {
        int k = 5;
        System.out.println(k);
        this.work2(6);
    }

    void work2(int i) {
        int j = 4;
        System.out.println(i+j);
    }
}

public class FieldComponent {
    public static void main(String[] args) {
        // 클래스를 이용해서 객체 생성
        A var = new A();

        // 필드 값 출력
        System.out.println(var.m);
        System.out.println(var.n);

        // 메서드 호출
        var.work1();
    }
}
