package day5.chaptor10.ex06;

class A {
    private int a = 2;
    private int b = 4;

    @Override
    public String toString() {
        return "A {" +
                "a=" + a +
                ", b=" + b +
                "}";
    }



}


public class ToString {
//    외부에서 n과 m에 직접적으로 접근하지 못하도록 방어적 코드를 작성할 필요가 있다.
    private int m;
    private int n;

    public String toString() {
        return "A {" +
                "m=" + m +
                ", n=" + n +
                "}";
    }

    //    간접적으로 메서드를 통해 필드에 접근 하도록 코드를 짜야 안전한 코드


//    set 은 저장하는 메서드
//    안전한 사용자인지 확인하는 코드
    public void setM(int m) {
        this.m = m;
    }

    public void setN(int n) {
        this.n = n;
    }


//    get 은 불러오는 메서드
//    안전한 사용자인지 확인하는 코드
    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public static void main(String[] args) {
        A a = new A();
//        hashCode값은 그 객체가 메모리에 머물러 있는 고유 위치 정보
        System.out.printf("%x\n", a.hashCode());
//        toString은 그 객체를 나타내는 대표적인 정보이다.
//        그 정보에 해시코드가 들어있는데 과연 필요 없을까?
        System.out.println(a.toString());
    }
}
