
import java.util.Scanner;

class AddNewElement {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = {10, 30, 50, 70};
        int b[] = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[b.length - 1] = sc.nextInt();
        System.out.println("Elements are: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
