
import java.util.Scanner;

public class InputAndConditionalLoops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int practiceDays = sc.nextInt();
        int problemsSolved = 0;
        int total = 0;

        for (int i = 1; i <= practiceDays; i++) {
            problemsSolved = sc.nextInt();
            total += problemsSolved;
        }

        String status = "";

        if (total >= 20) {
            status = "Strong progress";
        } else if (total >= 10 && total <= 19) {
            status = "Keep improving";
        } else {
            status = "Needs more practice";
        }

        System.out.println("Total solved: " + total);
        System.out.println("Status: " + status);

        sc.close();
    }
}
