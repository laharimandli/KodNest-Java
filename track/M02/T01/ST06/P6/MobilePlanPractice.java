
import java.util.Scanner;

public class MobilePlanPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String plan = sc.nextLine();
        int price = sc.nextInt();

        MobilePlan mp1 = new MobilePlan();
        MobilePlan mp2 = new MobilePlan(plan, price);

        mp1.display();
        mp2.display();
    }
}

class MobilePlan {

    String planName;
    int price;

    MobilePlan() {
        this.planName = "Basic";
        this.price = 199;
    }

    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}
