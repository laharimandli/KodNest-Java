
import java.util.*;

public class ClosestValueToTarget {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        long diff = Long.MAX_VALUE;
        int closest = 0;

        for (int num : arr) {
            long currentDiff = Math.abs((long) target - num);

            if (currentDiff < diff
                    || (currentDiff == diff && num < closest)) {

                diff = currentDiff;
                closest = num;
            }
        }

        System.out.println(closest);
    }
}
