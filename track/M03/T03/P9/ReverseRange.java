
import java.util.Scanner;

public class ReverseRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int startindx = sc.nextInt();
        int endindx = sc.nextInt();

        int i = startindx;
        int j = endindx;

        if (startindx >= 0 && endindx >= 0
                && startindx < size && endindx < size
                && startindx <= endindx) {

            while (i < j) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }

            for (int num : arr) {
                System.out.print(num + " ");
            }

        } else {
            System.out.println(-1);
        }
    }
}
