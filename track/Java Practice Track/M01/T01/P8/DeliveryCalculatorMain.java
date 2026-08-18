
import java.util.Scanner;

class DeliveryCalculator {

    int calculateCharge(int distance) {
        return distance * 5;
    }

    int calculateCharge(int distance, int expressFee) {
        return distance * 5 + expressFee;
    }
}

public class DeliveryCalculatorMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int expressFee = scanner.nextInt();

        DeliveryCalculator deliverycal = new DeliveryCalculator();

        System.out.println("Standard Charge: " + deliverycal.calculateCharge(distance));
        System.out.println("Express Charge: " + deliverycal.calculateCharge(distance, expressFee));
    }
}
