package day5.chaptor10.ex06;

public class CallGetterAndSetter {
    public static void main(String[] args) {
        ToString a = new ToString();
        a.setM(4);
        System.out.println(a.getM());
//        m을 직접적으로 접근이 불가능하다. 반드시 get or set을 통해서 접근해야한다.
//        System.out.println(a.m);

        a.setN(5);
        System.out.println(a.getN());
    }
}
