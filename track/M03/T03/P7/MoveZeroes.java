
import java.util.Scanner;

public class MoveZeroes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int j = 0; // write index

        // Move all non-zero elements to the front
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
