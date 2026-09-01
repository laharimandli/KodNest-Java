
import java.util.Scanner;

class AddElementMiddle {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = {10, 30, 50, 70};
        int b[] = new int[a.length + 1];
        System.out.println("Enter an index and Values to Add: ");
        int index = sc.nextInt();
        int value = sc.nextInt();
        int j = 0;
        for (int i = 0; i < b.length; i++) {
            if (i != index) {
                b[i] = a[j];
                j++;
            } else {
                b[i] = value;
            }
        }

        System.out.println("Elements are: ");
        for (int num : b) {
            System.out.print(num + " ");
        }
    }
}
