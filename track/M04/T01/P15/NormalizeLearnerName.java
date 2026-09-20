
import java.util.Scanner;

public class NormalizeLearnerName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String learnerName = scanner.nextLine();
        String newString = learnerName.trim().toUpperCase();

        System.out.println("Normalized name: " + newString);
    }
}
