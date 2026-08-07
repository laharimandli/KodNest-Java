
import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Byte Value: ");
        byte a = sc.nextByte();
        System.out.println("Byte Value: " + a);

        System.out.println("Enter Short Value: ");
        short b = sc.nextShort();
        System.out.println("Short Value: " + b);

        System.out.println("Enter Integer Value: ");
        int c = sc.nextInt();
        System.out.println("Integer Value: " + c);

        System.out.println("Enter Long Value: ");
        long d = sc.nextLong();
        System.out.println("Long Value: " + d);

        System.out.println("Enter Float Value: ");
        float e = sc.nextFloat();
        System.out.println("Float Value: " + e);

        System.out.println("Enter Double Value: ");
        double f = sc.nextDouble();
        System.out.println("Double Value: " + f);

        System.out.println("Enter Boolean Value: ");
        boolean g = sc.nextBoolean();
        System.out.println("BooleanValue: " + g);

    }

}
