
public class Demo1 {

    public static void main(String[] args) {
        Demo2 d1 = new Demo2();
        d1.display();
    }
}

class Demo {

    int a = 10;

    public void display() {
        System.out.println("Demo 1 : " + a);
    }
}

class Demo2 extends Demo {
}
