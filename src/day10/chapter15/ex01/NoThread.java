package day10.chapter15.ex01;
// 비디오 실행 프로그램을 만들려고 한다.
// 비디오 실행은 비디오 프레임(화면)과 같이 동시에 실행되어야 한다.
// 그렇다면 하나의 프로그램을 1. 프레임 2. 자막 두 개의 쓰레드로 구현해야 함.
// 먼저 쓰레드로 구현하지 않는 예시
// 사실 이중포문 안써도 될것 같은데...
// 쓰레드를 안쓰면 무조건 한개의 코어가 처리하기 때문에 비효율 적이다.
// 쓰레드를 2개 이상 쓰면 여러 코에에게 분산시킬 수 있다.


public class NoThread {
    public static void main(String[] args) {
        int[] frame = {1, 2, 3, 4, 5};
        String[] subtitle = {"하나", "둘", "셋", "넷", "다섯"};

        // 프레임 출력
        for (int i = 0; i<frame.length; ++i) {
            System.out.println("(비디오 프레임) " + frame[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i<subtitle.length; ++i) {
            System.out.println("(자막 번호) " + subtitle[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
