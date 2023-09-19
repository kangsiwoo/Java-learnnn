package ch01;
// 패키지 파일은 여러 관련된 클래스 파일들의 집합
public class ValueAssigment {
    public static void main(String[] args) {
        int[] array1 = new int[3]; // 3짜리 int형 배열을 만듦
        array1[0] = 3;
        array1[1] = 3;
        array1[2] = 4;
        System.out.println(array1[0] + " " + array1[1] + " " + array1[2]);

        int[] array2; // c언어에서는 배열의 크기조차 지정안하고 넘어가면 에러가 뜨지만 자바에서는 봐준다.
        array2 = new int[3];
        array2[0] = 5;
        array2[1] = 6;
        array2[2] = 7;
        System.out.println(array2[0] + " " + array2[1] + " " + array2[2]);

        int[] array3 = new int[] {3, 4, 5}; // 요소의 갯수만큼 세칸짜리 배열이 알아서 만들어짐
        System.out.println(array3[0] + " " + array3[1] + " " + array3[2]);

        int[] array4;
        array4 = new int[] {7, 8, 9};
        System.out.println(array4[0] + " " + array4[1] + " " + array4[2]);


        // 배열의 값 대입 방법 3(줄 바꿈이 불가능)
        int[] array5 = {10, 11, 12}; // new ~ 가 생략 가능하다.
        System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);

//        new를 쓰지 않고 배열을 만들었다면 초기화를 한꺼번에 꼭 해주어야한다.(줄바꿈이 안됨)
//        int[] array6;
//        array6 = {11, 12, 13};
//        System.out.println(array6[0] + " " + array6[1] + " " + array6[2]);
    }
}
