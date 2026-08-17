
import java.util.Scanner;

public class FoodOrders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String item = sc.nextLine();
        int quantity = sc.nextInt();

        FoodOrder fo1 = new FoodOrder(item);
        FoodOrder fo2 = new FoodOrder(item, quantity);

        fo1.display();
        fo2.display();
    }
}

class FoodOrder {

    String item;
    int quantity;

    FoodOrder(String item) {
        this.item = item;
        this.quantity = 1;
    }

    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}
