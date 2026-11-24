
import java.util.ArrayList;
import java.util.Scanner;

class ArrayListTraversing {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter n Elements: ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            al.add(element);
        }
        System.out.println("ArrayList: " + al);
        System.out.println();
        System.out.println("Traverse using For Loop: ");
        for (int i = 0; i < n; i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        System.out.println("Traverse using Advance For Loop: ");
        for (Object i : al) {
            System.out.print(i + " ");
        }

    }
}
