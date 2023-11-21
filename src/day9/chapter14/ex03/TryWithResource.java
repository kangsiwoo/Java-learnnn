package day9.chapter14.ex03;

// finally{} 는 맨 마지막에 반드시 마무리로 실행되어야 하는 문장이 들어감.
// 대표적으로 많이 쓰이는 형태는 '리소스 반납' 이다.
// 예를들어 스트림 반

import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class TryWithResource {
    public static void main(String[] args) {
        InputStreamReader isr1 = null;
        isr1 = new InputStreamReader(System.in);
        char input = 0;

        try {
            input = (char) isr1.read();
            System.out.println("입력 글자 : " + input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//            리소스 해제 구문(투박한 옛날 구문이다) 하지만 좋은 시도였다.
            try {
                isr1.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
//        위에서 내가 스트림을 finally에서 한번 close를 해 줬기 때문에
//

//        리소스 자동 해제
//        try 소괄호 안에 자동으로 해제하고 싶은 리소스를 적어 넣는다.
        try (InputStreamReader isr2 = new InputStreamReader(System.in)) {
            char input2 = (char)isr2.read();
            System.out.println("입력 글자 : " + input2);
        } catch (IOException e) {
            e.printStackTrace(); // 예외 내용을 친절하게 프린트 해줌.
        }
    }
}
