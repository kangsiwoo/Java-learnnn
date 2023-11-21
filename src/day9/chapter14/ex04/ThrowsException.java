package day9.chapter14.ex04;


//        1. 예외문장을 가지고 있는 놈이 직접 try-catch()
class A {
    void abc() {
        bcd();
    }
    void bcd() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class B {
    void abc() {
        try {
            bcd();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    void bcd() throws InterruptedException {
        Thread.sleep(1000);
    }
}

public class ThrowsException {
    public static void main(String[] args) {

//        2. 호출한 놈으로 예외를 전가할 때 throws
    }
}
