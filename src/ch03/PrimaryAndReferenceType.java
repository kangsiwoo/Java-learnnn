package ch03;

public class PrimaryAndReferenceType {
    public static void main(String[] args) {
        // 일반 변수의 대입 연산
        int value1 = 3;
        int value2 = value1;
        value2 = 7;
        System.out.println(value1);
        System.out.println(value2);
        // value1이 7로 같이 안바뀐 이유 : value1, 2는 참조변수가 아니라 일반변수이기 때문이다.

        // 참조 변수의 대입 연산
        int[] array1 = new int[] {3, 4, 5};
        int[] array2 = array1;
        array2[0] = 7;
        System.out.println(array1[0]);
        System.out.println(array2[0]);
        // array1이 가리키는 방의 값이 같이바뀐 이유 : array1, array2는 일반 변수가 아니라 참조변수이기 때문에.
    }
}
