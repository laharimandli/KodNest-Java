
import java.util.Scanner;

class DuckingException1 {

    public static void main(String[] args) {
        System.out.println("Main method Execution Started....");
        try {
            divide();
        } catch (Exception e) {
            System.out.println("Exception Handled in Main method");
        }
        System.out.println("Main method Execution Completed....");
    }

    static void divide() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int res = a / b;
        System.out.println("Result : " + res);

    }

}
