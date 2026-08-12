
import java.util.Scanner;

public class TwoMethodOverload {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String text = scanner.next();

        Printer p1 = new Printer();
        p1.show(number);
        p1.show(text);
    }
}

class Printer {

    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String word) {
        System.out.println("Word: " + word);
    }
}
