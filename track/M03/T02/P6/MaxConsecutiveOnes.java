
import java.util.*;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < size; i++) {

            if (arr[i] == 1) {
                count++;

                if (count > maxCount) {
                    maxCount = count;
                }

            } else {
                count = 0;
            }
        }

        System.out.println(maxCount);
    }
}
