
import java.util.Scanner;

public class RotateArray2 {

    static void reverse(int arr[], int left, int right) {
        int i = left;
        int j = right;
        while (i < j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        reverse(arr, 0, k - 1);
        reverse(arr, k, size - 1);
        reverse(arr, 0, size - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
