
import java.util.Scanner;

public class InitializeProductDetails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String prodname = sc.nextLine();
        double price = sc.nextDouble();

        Product product = new Product(prodname, price);

        product.display();
    }
}

class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}
