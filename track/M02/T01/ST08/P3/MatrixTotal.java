
import java.util.Scanner;

public class MatrixTotal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int cols = sc.nextInt();

        int arr[][] = new int[row][cols];

        // Read matrix elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Calculate row totals
        for (int i = 0; i < row; i++) {
            int total = 0;

            for (int j = 0; j < cols; j++) {
                total = total + arr[i][j];
            }

            System.out.println("Row " + (i + 1) + " total: " + total);
        }
    }
}
