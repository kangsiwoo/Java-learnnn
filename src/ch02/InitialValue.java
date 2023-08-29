package ch02;

public class InitialValue {
    public static void main(String[] args) {
        // 일반 변수나 배열은 초기화가 자동으로 되지 않는다(c언어에서는 0이나 쓰레기값이 자동으로 들어가는데...)
        int value1;
//        System.out.println(value1);
        int[] value2;
//        System.out.println(value2);
        int value3 = 0;
        System.out.println(value3);

        // 배열은 대표적인 참조 변수이다. 아직 주소를 담을 수 없다면 null로 초기화한다.
        int[] value4 = null;
        System.out.println(value4 + "\n");

        // new로 만든 자바의 실체들은 자동으로 초기화가 된다.
        int[] array1 = new int[] {0, 0, 0};
        for (int i = 0; i<3; i++) {
            System.out.println(array1[i]);
        }

        // boolean 배열의 초기값은 false이다.
        boolean[] array2 = new boolean[3];
        for (int i = 0; i<3; i++) {
            System.out.println(array2[i]);
        }

        // double 배열의 초기값은 0.0이다.
        double[] array3 = new double[3];
        for (int i = 0; i<3; i++) {
            System.out.println(array3[i]);
        }

        // String 배열의 초기값은 null 이다.
        // 이유는 String 으로 만든 변수도 참조변수이기 때문이다.
        String[] array4 = new String[3];
        for (int i = 0; i<3; i++) {
            System.out.println(array4[i]);
        }
    }
}
