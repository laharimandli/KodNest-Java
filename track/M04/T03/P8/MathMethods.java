
import java.util.Scanner;

public class MathMethods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("Maximum: " + Math.max(n1, n2));
        System.out.println("Minimum: " + Math.min(n1, n2));
        System.out.println("Absolute first: " + Math.abs(n1));
    }
}
