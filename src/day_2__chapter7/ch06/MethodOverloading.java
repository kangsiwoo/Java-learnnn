package day_2__chapter7.ch06;

public class MethodOverloading {
    public static void main(String[] args) {
        print(1.2);
    }

    public static void print() {
        System.out.println("데이터가 없습니다.");
    }

    public static void print(int a) {
//        원래는 1234를 출력해야 하지만 확인상 매 개변수를 출력하것다.
        System.out.println(a);
    }

    public static void print(double a) {
        System.out.println(a);
    }

//    public static void print(double b) {
//        System.out.println(a);
//    } 바로위의 메서드와 시그니처가 같기 때문에 에러가 뜬다
    public static void print(char a) {
        System.out.println(a);
    }
    public static void print(int a, int b) {
        System.out.println(a);
    }

//    메서드 시그니쳐가 다르다는 것은 이름은 똑같지만 매개변수의 종류나 개수가 다름을 의미

//    반환형이 다르다는 것은 호풀할 때 햇갈리기 때문에 시그니쳐가 같다라고 할 수 있다.
//    public static int print(int a, int b) {
//        System.out.println(a);
//        return a;
//    }

}
