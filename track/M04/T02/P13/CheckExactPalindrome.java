
import java.util.Scanner;

public class CheckExactPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder sb = new StringBuilder(word);
        String rev = new String(sb.reverse());
        boolean isPalindrome = word.equalsIgnoreCase(rev);
        System.out.println("Palindrome: " + isPalindrome);
    }
}
