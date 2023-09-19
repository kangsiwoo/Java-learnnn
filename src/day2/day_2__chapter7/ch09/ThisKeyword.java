package day2.day_2__chapter7.ch09;

class A {
    int m;
    int n;
//    this. 키워드를 사용하면 해당 지역변수가 아닌 필드를 가리키게 된다.
    void init(int m, int n) {
//        m = m;
//        n = n;
        this.m = m;
        this.n = n;

    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        A a = new A();
        a.init(2, 3);

        System.out.println(a.m);
        System.out.println(a.n);
    }
}
