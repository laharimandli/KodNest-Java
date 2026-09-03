
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isPalindrome = true;

        int i = 0;
        int j = size - 1;

        while (i < j) {

            if (arr[i] != arr[j]) {
                isPalindrome = false;
                break;
            }

            i++;
            j--;
        }
        if (isPalindrome) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
