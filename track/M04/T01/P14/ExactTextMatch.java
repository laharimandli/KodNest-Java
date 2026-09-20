
import java.util.Scanner;

public class ExactTextMatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expectedText = scanner.nextLine();
        String enteredText = scanner.nextLine();

        System.out.println("Match: "
                + expectedText.equals(enteredText));
    }
}
