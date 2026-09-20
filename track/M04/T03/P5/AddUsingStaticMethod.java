
import java.util.Scanner;

public class AddUsingStaticMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum: " + Calculator.add(num1, num2));
    }
}

class Calculator {

    static int add(int first, int second) {
        return first + second;
    }
}
