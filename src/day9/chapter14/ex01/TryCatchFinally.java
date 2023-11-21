package day9.chapter14.ex01;
// 예외가 발생할 가능ㅎ성이 있는 두 문장들을 {}로 묶어서 예외처리를 해주어 발생 가능성을 없엔다.
// 예외처리 하는 두가지 방법
// 1.  try-catch로 묶기(내가 책임짐)
// 2. throws로 던지기(나를 호출한 쪽에 던짐)
// try{} 에는 예외 발생 가능성이 있는 문장들을 적는 곳
// catch{}에는 try{}에서 만약 예외가 발생했다면 처리하는 차선책이 적히는 공간
// 만약 try{}에서 예외가 발생 안했으면 catch는 실행 안된다.
// finaly{}에서는 try와 catch에서 공통적으로 수행되는 명령어들을 적는다.


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("A");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("a");

        // forName안에 있는 클래스를 JVM이 메모리로 올려서 객체하나를 반환하는 명령
        try {
            Class cls = Class.forName("java.lang.Object");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        InputStreamReader in = new InputStreamReader(System.in); // 입출력 형식을 키보드로 하겠다.
        try {
            in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
