package day5.chaptor10.ex01;

class Human {
    String name;
    int age;

    void sleep() {
        System.out.println("먹었다");
    }
    void eat() {
        System.out.println("잤다");
    }
}

class Student extends Human {
    int studentID;

    void goToSchool() {
        System.out.println("등교했다");
    }
}

class Worker extends Human {
    int workerID;

    void goToWork() {
        System.out.println("출근했다");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // 사람
        Human h = new Human();
        h.name = "김현지";
        h.age = 11;
        h.eat();
        h.sleep();

        // 학생
        Student s = new Student();
        s.name = "김민성";
        s.age = 16;
        s.studentID = 128;
        s.eat();
        s.sleep();
        s.goToSchool();

        // 직원
        Worker w = new Worker();
        w.name = "김민성";
        w.age = 16;
        w.workerID = 128;
        w.eat();
        w.sleep();
        w.goToWork();
    }
}
