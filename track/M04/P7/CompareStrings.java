
import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstText = scanner.nextLine();
        String secondText = scanner.nextLine();

        System.out.println("Exact match: " + firstText.equals(secondText));
        System.out.println("Ignore-case match: " + firstText.equalsIgnoreCase(secondText));
    }
}
