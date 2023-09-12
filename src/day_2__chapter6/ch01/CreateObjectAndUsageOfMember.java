package day_2__chapter6.ch01;

class A { // public class는 무조건 파일당 하나
    int m = 3;
    void print() {
        System.out.println("객체의 생성과 활용");
    }
}

public class CreateObjectAndUsageOfMember {
    public static void main(String[] args) {
        // 클래스를 활용하여 객체를 생성
        A a = new A();

        // 객체 안의 필드에 5를 저장
        a.m = 5;
        System.out.println(a.m);

        // 객체 안에 있는 print() 메서드를 호출
        a.print();

    }
}
