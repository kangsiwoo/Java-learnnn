package day9.chapter14.ex02;


public class Multicatch {
    public static void main(String[] args) {
//        try {
//            System.out.println(3 / 0);
//        } catch(ArithmeticException e) {
//            System.out.println("숫자를 0으로 나눌 수 없습니다.");
//        } finally {
//            System.out.println("프로그램 종료");
//        }
//
//        try {
//            int num = Integer.parseInt("1a00"); // 이것도 실수 할  수 있는 예외 문장이다.
//            System.out.println(num);
//        } catch(NumberFormatException e) {
//            System.out.println("숫자로 바꿀 수 없습니다." + e);
//        }


        // 두가지 예외처리를 한 번의 try-catch로 처리하는 방법.
        try {
            System.out.println(3 / 0);
            int num = Integer.parseInt("10a0");
            System.out.println(num);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("예외가 발생 되었습니다.");
        }
    }
}

