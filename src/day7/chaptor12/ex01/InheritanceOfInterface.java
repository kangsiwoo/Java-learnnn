package day7.chaptor12.ex01;

// 클래스가 클래스를 구현하고 싶으면 -> extends
// 클래스가 인터페이스를 구현하고 싶으면 -> implements

interface A {}
interface B {}

class C implements A {}
class D implements A, B {} // Java는 다중상속을 지원하지 않지만 다중 인터페이스 상속은 지원한다.

// class E extends C, D {} Java는 다중상속을 하지 않는다.

// 클래스와 인터페이스를 동시에 상속받을 수 있다.
class F extends C implements A, B {}

public class InheritanceOfInterface {
}
