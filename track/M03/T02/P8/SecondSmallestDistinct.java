
import java.util.Scanner;

public class SecondSmallestDistinct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println(secondSmallest);
        } else {
            System.out.println("No second smallest distinct value");
        }
    }
}
