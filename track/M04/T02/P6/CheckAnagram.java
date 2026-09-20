
import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine().toLowerCase();
        String second = scanner.nextLine().toLowerCase();

        if (first.length() != second.length()) {
            System.out.println("Anagram: false");
            return;
        }

        char firstArr[] = first.toCharArray();
        char secondArr[] = second.toCharArray();
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        String sortedStr1 = new String(firstArr);
        String sortedStr2 = new String(secondArr);
        System.out.println("Anagram: "
                + sortedStr1.equals(sortedStr2));
    }
}
