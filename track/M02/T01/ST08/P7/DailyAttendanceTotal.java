
import java.util.Scanner;

public class DailyAttendanceTotal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int classes = sc.nextInt();
        int days = sc.nextInt();

        int[][] attendance = new int[classes][days];

        // Read the matrix
        for (int i = 0; i < classes; i++) {
            for (int j = 0; j < days; j++) {
                attendance[i][j] = sc.nextInt();
            }
        }

        // Calculate total for every day (column-wise)
        for (int j = 0; j < days; j++) {

            int total = 0;   // reset total for each day

            for (int i = 0; i < classes; i++) {
                total = total + attendance[i][j];
            }

            System.out.println("Day " + (j + 1) + " total: " + total);
        }
    }
}
