
import java.util.Scanner;

class RemoveElement {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = {10, 30, 50, 90, 70};
        int b[] = new int[a.length - 1];
        System.out.println("Enter an Element to Remove: ");
        int index = sc.nextInt();
        int j = 0;
        for (int i = 0; i < b.length; i++) {
            if (i != index) {
                b[i] = a[j];
                j++;
            } else {
                b[i] = a[j + 1];
                j++;
            }
        }

        System.out.println("Elements are: ");
        for (int num : b) {
            System.out.print(num + " ");
        }
    }
}
