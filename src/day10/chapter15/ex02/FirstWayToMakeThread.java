package day10.chapter15.ex02;

import com.sun.jdi.ThreadReference;

// 자막을 출력하는 쓰레드
class SIMFileThread extends Thread {
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
}
// 비디오 프레임을 출력하는 쓰레드
class VideoFileThread extends Thread {
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
}


public class FirstWayToMakeThread {
//    두개의 쓰레드를 객체 생성해서 동시에 실
    public static void main(String[] args) {
        Thread simFileThread = new SIMFileThread();
        simFileThread.start();

        Thread videoFileThread = new VideoFileThread();
        videoFileThread.start();
    }
}
