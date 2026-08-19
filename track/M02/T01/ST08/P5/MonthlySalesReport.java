
import java.util.Scanner;

public class MonthlySalesReport {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[row][cols];

        // Read sales values
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Calculate total sales for each product
        for (int i = 0; i < row; i++) {
            int total = 0;

            for (int j = 0; j < cols; j++) {
                total = total + arr[i][j];
            }

            System.out.println("Product " + (i + 1) + " total: " + total);
        }
    }
}
