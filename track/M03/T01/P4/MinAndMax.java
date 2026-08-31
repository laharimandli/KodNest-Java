
import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int val = sc.nextInt();
        int max = val;
        int min = val;

        for (int i = 1; i < size; i++) {

            int inp = sc.nextInt();

            if (inp > max) {
                max = inp;
            } else if (inp < min) {
                min = inp;
            }
        }

        System.out.println(min + " " + max);

        sc.close();
    }
}
