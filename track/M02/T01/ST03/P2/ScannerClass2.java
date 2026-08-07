
import java.util.Scanner;

public class ScannerClass2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        System.out.println("Age: " + age);

        System.out.println("Enter Height: ");
        float height = sc.nextFloat();
        System.out.println("Height: " + height);

        sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();
        System.out.println("Name: " + name);

    }

}
