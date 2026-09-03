
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

        for (int i = 1; i <= k; i++) {
            int temp = arr[0];

            for (int j = 1; j < size; j++) {
                arr[j - 1] = arr[j];
            }

            arr[size - 1] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
