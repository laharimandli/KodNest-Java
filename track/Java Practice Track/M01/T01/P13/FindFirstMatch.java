
import java.util.Scanner;

public class FindFirstMatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int index = -1;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println("First index: " + index);
    }
}
