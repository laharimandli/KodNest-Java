
import java.util.Scanner;

class RotateArrayClockwise {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = {12, 23, 34, 45};
        int temp = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];

        }
        a[0] = temp;

        System.out.println("Array Elements are: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
