
import java.util.Scanner;

public class SimpleMethodTypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();

        MethodDemo md = new MethodDemo();

        md.sayHello();
        md.greet(name);
        System.out.println("Lucky Number: " + md.getLuckyNumber());
        System.out.println("Sum: " + md.add(a, b));
    }
}

class MethodDemo {

    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.printf("Hello, %s!", name);
        System.out.println();
    }

    int getLuckyNumber() {
        return 7;
    }

    int add(int first, int second) {
        return first + second;
    }
}
