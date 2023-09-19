package day2.day_2__chapter7.ch04;

public class EffectOfPrimaryArgument {
    public static void main(String[] args) {
        int a = 3;
        int result1 = twice(3);
        System.out.println(result1);
        int result2 = twice(a);
        System.out.println(result2);
        System.out.println(a);

//        다른 나라의 메서드에 있는 a와 우리 메서드 a는 서로 다른 a이므로 바뀌지 않았다.
//        call by value의 예시     : 변수의 주소가 아닌 값만 저달하는 예시

    }

    public static int twice(int a) {
        a = a * 2;
        return a;
    }
}
