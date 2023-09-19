package day2.day_2__chapter7.ch05;

import java.util.Arrays;

public class EffectOfReferenceArgument {
    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3};
        System.out.println(Arrays.toString(a));
        twice(a);
        System.out.println(Arrays.toString(a));

//        call by reference의 예시: 값을 전할한게 아니라 주소를 전달했기 때문에
//        main 메서드의 a와 twice 메서드의 a는 같은 배열 이므로 같이 값이 바뀌었다.
    }

    public static void twice(int[] a) {
        for (int i = 0; i<a.length; ++i) {
            a[i] *= 2;
        }
    }

}
