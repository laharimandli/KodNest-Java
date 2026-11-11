
import java.util.Scanner;

public class ArithmeticException1 {

    public static void main(String[] args) {
        System.out.println("Connection Established");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("Result: " + res);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.err.println("Connection Terminated");

    }
}
