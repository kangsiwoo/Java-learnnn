## 클래스

### 추상메서드 : 완성되지 않은 메서드

 - '완성되었다' 의 기준은 중괄호의 유무에 따라 달라진다.

         void abc() {}; // 완성된 메서드
         void bcd(); // 완성되지 않은 메서드

 - 추상메서드라면 abstract를 사용해야 한다.

       abstract void cdb();

### 추상클래스 : 완성되지 않은 메서드를 하나라도 가진 클래스

      abstract class A { int a; abstract void abc(); } // 하지만 추상메서드가 없더라도 추상클래스를 사용할 수 있다.

      (1. abstract를 한다) class B extends A { // A에 있는 필드와 메서드들을 있는 B로 통째로 가져온다
         (2. Override를 이용하여 메서드를 완성시킨다.)
         @Override
         void abc() {};
      } 

### 인터페이스 : 모든 메서드가 추상 메서드일때 해당 클래스를 인터페이스로 정의한다.

- class -> interface

      interface A {
         abstract void abc();
         abstract void bcd();
      }

      class B implements A { // A가 책임지고 모든 메서드들을 재정의 하겠다. 하지만 absract와 interface가 같이 사용할 수 있다.
         @Override
         void abc() {}
      }

      class C extends B {
         @Override
         void bcd() {}
      }