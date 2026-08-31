
import java.util.*;

public class LongestContinuousSegment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 1;
        int maxLength = 1;

        for (int i = 0; i < size - 1; i++) {

            if (arr[i] < arr[i + 1]) {
                count++;

                if (count > maxLength) {
                    maxLength = count;
                }
            } else {
                count = 1;
            }
        }

        System.out.println(maxLength);
    }
}
