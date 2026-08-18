
import java.util.Scanner;

class OrderCalculator {

    int calculateSubtotal(int price, int quantity) {
        return price * quantity;
    }

    int calculateFinalTotal(int subtotal, int deliveryCharge) {
        return subtotal + deliveryCharge;
    }
}

public class FoodOrderTotal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int quantity = scanner.nextInt();
        int deliveryCharge = scanner.nextInt();

        OrderCalculator orderCalculator = new OrderCalculator();

        int subTotal = orderCalculator.calculateSubtotal(price, quantity);
        int finalTotal = orderCalculator.calculateFinalTotal(subTotal, deliveryCharge);

        System.out.println("Subtotal: " + subTotal);
        System.out.println("Final Total: " + finalTotal);
    }
}
