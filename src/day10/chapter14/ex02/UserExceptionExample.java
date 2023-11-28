package day10.chapter14.ex02;

import java.io.IOException;
import java.util.Scanner;

// 점수가 음수일 때의 예외
class MinusException extends Exception {
    public MinusException() {
        super();
    }
    public MinusException(String message) {
        super(message);
    }

}

// 점수가 100점을 초과할 때의 예외
class OverException extends Exception {
    public OverException() {
        super();
    }
    public OverException(String message) {
        super(message);
    }
}
// A클래스를 만들어서 예외 두 개를 호출
class A {
    void checkScore(int score) throws MinusException, OverException {
        if (score < 0) {
//            Exception을 발동시키는 문법 -> throw
            throw new MinusException("음숫값이 입력 되었습니다. : " + score);
        } else if (score > 100) {
            throw new OverException("100을 넘는 값이 입력되었습니다. : " + score);
        } else {
            System.out.println("정상 적인 값입니다. : " + score);
        }
    }
}

public class UserExceptionExample {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        A a = new A();
        int score;
        while (true) {
            System.out.print("점수를 입력 : ");
            score = in.nextInt();

            try {
                a.checkScore(score);
            } catch (MinusException | OverException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

    }
}
