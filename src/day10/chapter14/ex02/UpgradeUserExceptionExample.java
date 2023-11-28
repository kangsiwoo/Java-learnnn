package day10.chapter14.ex02;

import java.io.IOException;

// 점수가 음수일 때의 예외
class MinusScoreException extends Exception {
    public MinusScoreException() {
        super();
    }
    public MinusScoreException(String message) {
        super(message);
    }

}

// 점수가 100점을 초과할 때의 예외
class OverScoreException extends Exception {
    public OverScoreException() {
        super();
    }
    public OverScoreException(String message) {
        super(message);
    }
}
// A클래스를 만들어서 예외 두 개를 호출
class CheckScore {
    void checkScore(int score) throws MinusScoreException, OverScoreException {
        if (score < 0) {
//            Exception을 발동시키는 문법 -> throw
            throw new MinusScoreException("예외 발생: 음숫값 입력");
        } else if (score > 100) {
            throw new OverScoreException("예외 발생: 100을 넘었다");
        }
    }
}

public class UpgradeUserExceptionExample {
    public static void main(String[] args) {
        CheckScore checkScore = new CheckScore();
        int score;
        while (true) {
            try {
                score = (int)System.in.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                checkScore.checkScore(score);
            } catch (MinusScoreException | OverScoreException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
    }
}
