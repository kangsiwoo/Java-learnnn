package day2.day_2__chapter7.ch03;

import java.util.Arrays;

public class ArrayArgumentMethod {
    public static void main(String[] args) {
        int[] array1 = new int[] {1,2,3};
        printArray(array1);
        printArray(new int[] {4,5,6});
//        printArray({7,8,9}); // java: illegal start of expression
//                             // 객체를 만들지 않아서
        int[] array2 = {10, 11, 12};
        printArray(array2);
//        이건 객체를 안만든것이 아니라 "한줄에 다 적어서" 컴파일러가 생략해도 알잘딱해서 new를 넣어줌
    }

    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
