
import java.util.Scanner;

public class CinemaSeatAnalyser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Read seat values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int availableSeats = 0;

        // Count available seats (0)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    availableSeats++;
                }
            }
        }

        System.out.println("Available seats: " + availableSeats);
    }
}
