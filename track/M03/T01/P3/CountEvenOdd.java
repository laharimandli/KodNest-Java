
import java.util.Scanner;

public class CountEvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        long evenCount = 0;
        long oddCount = 0;

        for (int i = 0; i < size; i++) {

            if (sc.nextLong() % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println(evenCount + " " + oddCount);

        sc.close();
    }
}
