
import java.util.Scanner;

public class EquilibriumIndex {

    static int sum(int arr[], int left, int right) {
        int s = 0;
        for (int i = left; i <= right; i++) {
            s += arr[i];
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = -1;
        for (int i = 0; i < n; i++) {
            int left = sum(arr, 0, i - 1);
            int right = sum(arr, i + 1, n - 1);

            if (left == right) {
                index = i;
            }
        }

        System.out.println(index);
    }
}
