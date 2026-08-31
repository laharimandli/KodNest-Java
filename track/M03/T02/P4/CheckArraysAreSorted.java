
import java.util.Arrays;
import java.util.Scanner;

public class CheckArraysAreSorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int largest = arr[size - 1];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println(secondLargest);
        } else {
            System.out.println("No second largest distinct value");
        }

        sc.close();
    }
}
