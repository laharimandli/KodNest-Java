
import java.util.Scanner;

public class AddPrefix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String baseText = scanner.nextLine();
        String prefix = scanner.nextLine();

        // Insert the prefix and display the result.
        StringBuilder sb = new StringBuilder(baseText);
        sb.insert(0, prefix + " ");
        System.out.println("Result: " + sb);
    }
}
