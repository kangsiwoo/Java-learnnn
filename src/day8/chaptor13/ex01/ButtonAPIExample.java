package day8.chaptor13.ex01;
// Button 클래스 안에는 onClick() 과 같은 메서드가 졵재한다.
// onClick()을 실행 했을 때 어떤 동작을 실행할 것인지는 때에 따라 다르다.(추상 메서드로 만든다.)
// 귀르러 기울이고 있다가(이벤트 리스너) 누군가가 setOnClickListener를 호출했을 때
// onClick() 메서드의 역할이 정해지게 되고 누군가가 정의한 오버라이딩 대로 실행된다.

import day3.chapter9.ex01_1.B;

class Button {

    OnClickListener col;
    void setOnClickListener(OnClickListener ocl) {// 구현된 OnClickListener 인터페이스를 외부에서 받아와서 집어 넣겠다.
        this.col = ocl;
    }
    interface OnClickListener {
        void onClick();
    }

    void onClick() {
        col.onClick();
    }
}

public class ButtonAPIExample {
    public static void main(String[] args) {
        // 클릭하면 음악 재행
        Button btn = new Button(); // 첫번째 버튼 객체 생성
        // 추상 메서드를 바로 new 해서 바로 줄 수는 없다.
        // 추상 메서드를 오버라이딩한 어떤 자식 클래스를 new로 넘겨주거나
        // 익명 이넠믈래스로 오버라이딩 해야한다.
        btn.setOnClickListener(new Button.OnClickListener() { // 응 익명 이너 클래승챠
            @Override
            public void onClick() {
                System.out.println("음악 재생 중");
            }
        });

        btn.onClick();

        Button naver = new Button();
        naver.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("run naver");
            }
        });

        naver.onClick();
    }
}
