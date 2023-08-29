package ch04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReadArray {
    public static void main(String[] args) {
        int[] array = new int[] {3, 4, 5, 6, 7};

        // 출력하기 1
        System.out.print(array[0] + " ");
        System.out.print(array[1] + " ");
        System.out.print(array[2] + " ");
        System.out.print(array[3] + " ");
        System.out.print(array[4] + " ");
        System.out.println();

        // 출력하기 2 for문
        // for문 쓸 때 배열의 길이가 바뀌면 일일이 수정해야하니 좋지 않은 코드가 됨.
        // .length 를 사용할 필요가 있다.
        for (int i = 0; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //출력하기 3 each-for문
        for (int i:array)
            System.out.print(i + " ");
        System.out.println();

        //출력하기 4
        System.out.println(Arrays.toString(array));
    }
}
