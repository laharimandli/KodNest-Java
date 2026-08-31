
import java.util.Scanner;

public class CountPosNegValues {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int pos = 0;
        int neg = 0;
        int zero = 0;

        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();

            if (val > 0) {
                pos++;
            } else if (val < 0) {
                neg++;
            } else {
                zero++;
            }
        }

        System.out.println(pos + " " + neg + " " + zero);

        sc.close();
    }
}
