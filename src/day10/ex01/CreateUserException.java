package day10.ex01;
// 사용자 정의 예외처리
// 내가 원하는 예외를 터미널에 띄울 수 있다

class MyException extends Exception {
//    기본 생성자
    public MyException() {
        super(); // 부모 생성자를 함께 호출(Exception)
    }
//    매개변수 생성자
    public MyException(String message) { // message에는 내가 원하는 예외 메시지가 담긴다.
        super(message);
    }

}

class A {
    void abc_1 (int num) {
        if (num > 70) {
            System.out.println("정상 작동");
        } else {
            try {
                throw new MyException("전달된 숫자가 70보다 커야 합니다.");
            } catch (MyException e) {
//                throw new RuntimeException(e);
                System.out.println(e.getMessage());
            }
        }
    }
    void bcd_1 () {
        abc_1(65);
    }
}


public class CreateUserException {
    public static void main(String[] args) {
        A a = new A();
        a.bcd_1();
    }
}
