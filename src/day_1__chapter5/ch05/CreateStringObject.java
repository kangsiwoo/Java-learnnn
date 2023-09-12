package ch05;

public class CreateStringObject {
    public static void main(String[] args) {
        // new~ 키워드
        // 배열의 경우 배열의 실제'방'을 만드는 명령어다.
        // 이처럼 new~ 로 만든 실제'방'을 우리는 '객체'라고 부른다.

        // String 객체 생성 1.
        // 배열을 제외하고 재일 앞글자가 대문자로 시작하는 자료형은 모두 참조변수 자료형 이다.
        /*
         일반 자료형
        int a;

         참조자료형
        Hole b;

         */

        // new로 객체를 만들었고 그 객체의 주소가 담긴다. 왜? str1이 참조 변수니까
        // String이라는 클래스로 만든 변수는 전부 참조 변수다.
        String str1 = new String("안녕");
        System.out.println(str1);

        // String 객체 생성 2.
        // String 객체를 만들 때에도 배열 객체를 만들 때처럼 new 키워드를 생략 가능하다.
        // 다만, new 키워드가 없다고 해서 객체가 안만들어 지는것은 아니다.
        String str2 = "안녕하세요";
        System.out.println(str2);

    }
}
