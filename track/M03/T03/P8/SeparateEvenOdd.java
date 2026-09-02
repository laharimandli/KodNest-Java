
import java.util.Scanner;

public class SeparateEvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int j = size - 1;

        for (int i = 0; i < size / 2; i++) {

            if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                // Swap odd on left with even on right
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            } else if (arr[i] % 2 == 0) {
                // Left is already even
                j--;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
