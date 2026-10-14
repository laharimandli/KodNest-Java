
public class AbstractDemo1 {

    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        accessMethod(c1);
        accessMethod(c2);
    }

    static void accessMethod(Parent ref) {
        ref.display1();
        ref.display2();
    }
}

abstract class Parent {

    abstract void display1();

    abstract void display2();
}

class Child1 extends Parent {

    @Override
    void display1() {
        System.out.println("Inside Child 1 class display1 method");
    }

    @Override
    void display2() {
        System.out.println("Inside Child 1 class display2 method");
    }
}

class Child2 extends Parent {

    @Override
    void display1() {
        System.out.println("Inside Child 2 class display1 method");
    }

    @Override
    void display2() {
        System.out.println("Inside Child 2 class display2 method");
    }
}
