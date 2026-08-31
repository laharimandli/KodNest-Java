
import java.util.Scanner;

public class FirstAndLastOccurence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int first = -1;
        int last = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {

                if (first == -1) {
                    first = i;
                }

                last = i;
            }
        }

        System.out.println(first + " " + last);

        sc.close();
    }
}
