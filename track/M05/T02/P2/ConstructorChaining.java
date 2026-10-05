
class ConstructorChaining {

    public static void main(String[] args) {
        Child c1 = new Child();

    }
}

class Parent {

    // public Parent() {
    //     System.out.println("Inside Parent 0 paramenter constructor");
    // }
    public Parent(int a) {
        System.out.println("Inside Parent 1 paramenter constructor");
    }

}

class Child extends Parent {

    public Child() {
        super(10);
        System.out.println("Inside Child 0 paramenter constructor");
    }

    // public Child(int a) {
    //     System.out.println("Inside Child 1 paramenter constructor");
    // }
}
