
import java.util.Scanner;

public class IterativeLearnerProgressSummary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String learnerName = scanner.nextLine();
        int practiceDays = scanner.nextInt();
        int total = 0;
        String status = "";

        for (int i = 1; i <= practiceDays; i++) {
            int solvedProblems = scanner.nextInt();
            total += solvedProblems;
        }

        double avg = (double) total / practiceDays;

        if (avg >= 5.0) {
            status = "Consistent";
        } else {
            status = "Needs consistency";
        }

        System.out.println("Learner: " + learnerName);
        System.out.println("Total solved: " + total);
        System.out.println("Daily average: " + avg);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
