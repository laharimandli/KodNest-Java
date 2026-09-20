
import java.util.Scanner;

public class TraceStringChanges {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();

        // Call toUpperCase() without storing the result.
        System.out.println("Original: " + original);
        System.out.println("After ignored call: " + original);
        // Create and display an uppercase copy.
        String uppercase = original.toUpperCase();
        System.out.println("Uppercase copy: " + uppercase);
    }
}
