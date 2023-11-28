package day10.chapter15.ex04;
// 실무에서 가장 많이 사용하는 방법
// 세번째 방법도 러너블 인터페이스를 구현하는것은 똑같으니
// 익.인 클래스를 활용하는 방법이다.
// 익.인을 활용하면 클래스를 처음에 선언할 필요가 없어진다.

public class ThirdWayToMakeThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                String[] subtitle = {"하나", "둘", "셋", "넷", "다섯"};

                for (int i = 0; i<subtitle.length; ++i) {
                    System.out.println(" - (자막 번호) " + subtitle[i]);
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int[] frame = {1, 2, 3, 4, 5};

                for (int i = 0; i<frame.length; ++i) {
                    System.out.println("(비디오 프레임) " + frame[i]);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}
