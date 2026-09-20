
import java.util.Scanner;

public class FindLarger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("Larger: " + NumberUtility.larger(n1, n2));
    }
}

class NumberUtility {

    static int larger(int first, int second) {
        return Math.max(first, second);
    }
}
