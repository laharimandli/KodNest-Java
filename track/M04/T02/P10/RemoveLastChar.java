
import java.util.Scanner;

public class RemoveLastChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // Remove the last character and display the result.
        StringBuilder sb = new StringBuilder(text);
        sb.deleteCharAt(sb.length() - 1);
        System.out.println("Result: " + sb);
    }
}
