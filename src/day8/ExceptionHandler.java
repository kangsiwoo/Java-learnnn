package day8;
// 예외처리를 하는 방법 : try-catch-finally 을 잘 사용 한다
// try{} : 예외가 발생할 수 있는 구문들을 적는 곳
// catch{} : try{}에서 예외가 발생했다면 실행되는 차선책들이 적히는 곳
// finally{} : try{} 와 catch{}에서 공통적으로 실행되는 문장을 적어놓는 곳
// finally{}는 리소스르러 반납할 때 쓰인다.

// 차선책은 해당 예외에 적절한 코드를 적는곳


public class ExceptionHandler {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
        } catch(ArithmeticException e) {
            System.out.println("숫자는 0으로 나눌 수 없습니다. : " + e);
        } finally {
            System.out.println("프로그램 종료");
        }

        try {
            int num = Integer.parseInt("L"); // 문자열을 숫자로 변경 시켜줌
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("정수가 아닌 문자열을 정수로 바꿀 수 없습니다. : " + e);
        }
//        예외처리를 하는 방법
//        try-catch : catch에서 명령어를 처리한다.
//        throws : 호출한 쪽에 문제를 던져서 메서드가 처리하게 하는 방법
    }
}
