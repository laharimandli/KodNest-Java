
import java.util.Scanner;

class DuckingException2 {

    public static void main(String[] args) throws Exception {
        System.out.println("Main method Execution Started....");
        divide();
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
