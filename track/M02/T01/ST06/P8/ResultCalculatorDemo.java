
import java.util.Scanner;

public class ResultCalculatorDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();

        ResultCalculator resultcalc = new ResultCalculator();

        System.out.println("Two-Mark Total: " + resultcalc.getTotal(m1, m2));
        System.out.println("Three-Mark Total: " + resultcalc.getTotal(m1, m2, m3));
    }
}

class ResultCalculator {

    int getTotal(int first, int second) {
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        return first + second + third;
    }
}
