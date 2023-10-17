package day5.chaptor10.ex03;

class A {
    int m = 3;
    void abc() {
        System.out.println("Class A");
    }

    @Override
    public String toString() {
        return "안녕 나는 클래스 A야. 필드 m과 메서드 abc()를 가지고 있지 - " + Integer.toHexString(this.hashCode());
    }
}

class B extends A {
    int n = 4;
    @Override
    void abc() {
        System.out.println("Welcome to the Class A");
    }
    void bcd() {
        System.out.println("Class B");
    }
    @Override
    public String toString() {
        return "안녕 나는 클래스 B야. 필드 n과 메서드 bcd()를 가지고 있지 - " + Integer.toHexString(this.hashCode());
    }
}

public class TypeCasting {
    public static void main(String[] args) {
//        작은 풍선만 만들고 작은 풍선을 가리키는 경우
        A aa = new A();
        System.out.println(aa.toString());
        System.out.println(aa.m);
        aa.abc();

//        작고, 큰 풍선을 둘 다 만들고 작은 풍선을 가리키는 경우
        A bb = new B();
        System.out.println(bb.toString());
        System.out.println(bb.m);
        bb.abc();
//        bb가 가리키는 작은 풍선안에 n이 없기 때문에 사용 불가하다.
//        System.out.println(bb.n);
//        A였던 bb를 B로 다운캐스팅했다. 즉 큰 풍선을 가리키는 것으로 바꿈.
        System.out.println(((B) bb).n);

//        크고, 작은 풍선을 둘 다 만들고 큰 풍선을 가리키는 경우
        B cc = new B();
        System.out.println(cc.m);
        System.out.println(cc.n);
        cc.abc();
        cc.bcd();
    }
}
