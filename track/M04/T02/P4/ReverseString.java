
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char charArr[] = text.toCharArray();
        char revArr[] = new char[charArr.length];
        int j = revArr.length - 1;

        for (int i = 0; i < charArr.length; i++) {
            revArr[j] = charArr[i];
            j--;
        }

        System.out.println("Reversed: " + new String(revArr));
    }
}
