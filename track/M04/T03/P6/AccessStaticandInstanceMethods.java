
import java.util.Scanner;

public class AccessStaticandInstanceMethods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String learnerName = sc.nextLine();

        Learner l1 = new Learner(learnerName);
        l1.displayName();
        l1.displayInstitute();
    }
}

class Learner {

    String name;
    static String institute = "KodNest";

    Learner(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Learner: " + name);
    }

    static void displayInstitute() {
        System.out.println("Institute: " + institute);
    }
}
