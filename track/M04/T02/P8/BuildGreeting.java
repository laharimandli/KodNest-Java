
import java.util.Scanner;

public class BuildGreeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String learnerName = scanner.nextLine();

        // Build and display the greeting.
        System.out.println("Hello, " + learnerName + "!");
    }
}
