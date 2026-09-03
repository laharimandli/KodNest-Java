
import java.util.Scanner;

public class RotateArrayLeftByK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        k = k % size;

        // Reverse first k elements
        int i = 0;
        int j = k - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        // Reverse remaining elements
        i = k;
        j = size - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        // Reverse entire array
        i = 0;
        j = size - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        // Print array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
