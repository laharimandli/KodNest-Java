
import java.util.Scanner;

class RotateArrayAnticlockwise {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = {12, 23, 34, 45};
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = temp;

        System.out.println("Array Elements are: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
