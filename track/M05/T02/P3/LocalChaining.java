
class GlobalChaining {

    public static void main(String[] args) {
        Child c1 = new Child();

    }
}

class Parent {

    Parent() {
        System.out.println("Inside Parent 0-parameter constructor");
    }

}

class Child extends Parent {

    Child() {
        this(10);
        System.out.println("Inside Child 0-parameter constructor");
    }

    Child(int a) {
        this(10, 20);
        System.out.println("Inside Child 1-parameter constructor");
    }

    Child(int a, int b) {
        System.out.println("Inside Child 2-parameter constructor");
    }

}
