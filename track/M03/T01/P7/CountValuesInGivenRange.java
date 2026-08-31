
import java.util.Scanner;

public class CountValuesInGivenRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int lower = sc.nextInt();
        int upper = sc.nextInt();

        int count = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] >= lower && arr[i] <= upper) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
