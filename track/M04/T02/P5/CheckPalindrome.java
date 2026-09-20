
import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char charArr[] = word.toCharArray();
        char revArr[] = new char[charArr.length];
        int j = revArr.length - 1;

        for (int i = 0; i < charArr.length; i++) {
            revArr[j] = charArr[i];
            j--;
        }

        String revStr = new String(revArr);
        System.out.println("Reversed: " + revStr);
        System.out.println("Palindrome: "
                + word.equalsIgnoreCase(revStr));
    }
}
