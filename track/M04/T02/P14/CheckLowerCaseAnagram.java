
import java.util.Scanner;

public class CheckLowerCaseAnagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        boolean isAnagram = true;

        if (first.length() != second.length()) {
            isAnagram = false;
            System.out.println("Anagram: " + isAnagram);
        } else {
            StringBuilder sb = new StringBuilder(second);
            char arr[] = first.toCharArray();

            for (char c : arr) {
                int index = sb.indexOf(String.valueOf(c));
                if (index == -1) {
                    isAnagram = false;
                    break;
                }
                sb.deleteCharAt(index);
            }
            System.out.println("Anagram: " + isAnagram);
        }
    }
}
