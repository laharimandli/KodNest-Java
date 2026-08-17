
import java.util.Scanner;

public class StoreElementsInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[a.length];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements in First Array are: ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
        int j = b.length - 1;
        for (int i = a.length - 1; i >= 0; i--) {
            b[j] = a[i];
            j--;
        }

        System.out.println("Array Elements in Second Array are: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}
