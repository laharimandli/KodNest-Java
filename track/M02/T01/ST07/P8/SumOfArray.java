
import java.util.Scanner;

class SumOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int sum = 0;

        System.out.println("Enter the Elements are: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Array Elements are: ");
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Total: " + sum);
    }
}
