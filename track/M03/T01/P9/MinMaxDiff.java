
import java.util.Scanner;

public class MinMaxDiff {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int max = sc.nextInt();
        int min = max;

        for (int i = 1; i < size; i++) {
            int val = sc.nextInt();

            if (val > max) {
                max = val;
            }

            if (val < min) {
                min = val;
            }
        }

        System.out.println(max - min);

        sc.close();
    }
}
