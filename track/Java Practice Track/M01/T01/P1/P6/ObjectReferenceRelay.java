
import java.util.Scanner;

public class ObjectReferenceRelay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PracticeTask first = new PracticeTask();
        first.id = sc.nextInt();

        PracticeTask second = new PracticeTask();
        second.id = sc.nextInt();

        PracticeTask third = new PracticeTask();
        third.id = sc.nextInt();

        int unreachableId = first.id;

        PracticeTask relay = first;

        first = second;
        second = third;
        relay = second;
        third = first;

        System.out.println("First Reference: " + first.id);
        System.out.println("Second Reference: " + second.id);
        System.out.println("Third Reference: " + third.id);
        System.out.println("Relay Reference: " + relay.id);
        System.out.println("Unreachable Object: " + unreachableId);
    }
}

class PracticeTask {

    int id;
}
