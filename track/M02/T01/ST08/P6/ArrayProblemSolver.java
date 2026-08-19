
import java.util.Scanner;

public class ArrayProblemSolver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int total = 0;

        for (int i = 0; i < size; i++) {
            total += arr[i];
        }

        System.out.println("Array total: " + total);

        int matrixtotal = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixtotal += matrix[i][j];
            }
        }

        System.out.println("Matrix total: " + matrixtotal);
    }
}
