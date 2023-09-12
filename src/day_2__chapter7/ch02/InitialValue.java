package day_2__chapter7.ch02;

class A {
    // 다양한 필드 정의 근데 초기화 안함 과연 어떤값이 있을꼬?
    boolean m1;
    int m2;
    double m3;
    String m4;

    // 초기화 안 시킨 필드 출력하는 메서드
    void printFieldValue() {
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }

    void printLocalVariable() {
        int k = 10;
        System.out.println(k);
    }
}

public class InitialValue {
    public static void main(String[] args) {
        A a = new A();

        a.printFieldValue();
        // 어라라 출력이 잘 되누?
        // 아 필드는 컴파일러가 자동으로 초기화 시켜주는구나

        a.printLocalVariable();
        // 어라라 이쉨은 오류가 뜨누?
        //
        // java: variable k might not have been initialized
        //       값        k 가        초기화 안됨
        // 아하 지역변수는 무조건 초기화 해줘야 하는고만.!?!?!??!?!?!!
    }
}
