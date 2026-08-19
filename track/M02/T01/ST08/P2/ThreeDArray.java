
import java.util.Scanner;

class ThreeDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][][] = new int[3][3][5];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 4; k++) {
                    arr[i][j][k] = sc.nextInt();
                }

            }
        }
        System.out.println("Array Elements are: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length; j++) {
                for (int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}
