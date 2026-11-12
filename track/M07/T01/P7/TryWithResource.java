
import java.util.Scanner;

class TryWithResource {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            System.out.println("Age: " + age);
        }
    }

}
