
import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        long sum = 0;

        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        double average = (double) sum / size;

        System.out.println(sum);
        System.out.printf("%.2f", average);

        sc.close();
    }
}
