
import java.util.Scanner;

public class SupportTicketReference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SupportTicket first = new SupportTicket();
        first.id = scanner.nextInt();
        first.priority = scanner.nextInt();
        first.waitingMinutes = scanner.nextInt();

        SupportTicket second = new SupportTicket();
        second.id = scanner.nextInt();
        second.priority = scanner.nextInt();
        second.waitingMinutes = scanner.nextInt();

        SupportTicket third = new SupportTicket();
        third.id = scanner.nextInt();
        third.priority = scanner.nextInt();
        third.waitingMinutes = scanner.nextInt();

        SupportTicket selected = first;

        if (second.priority > selected.priority
                || (second.priority == selected.priority
                && second.waitingMinutes > selected.waitingMinutes)
                || (second.priority == selected.priority
                && second.waitingMinutes == selected.waitingMinutes
                && second.id < selected.id)) {
            selected = second;
        }

        if (third.priority > selected.priority
                || (third.priority == selected.priority
                && third.waitingMinutes > selected.waitingMinutes)
                || (third.priority == selected.priority
                && third.waitingMinutes == selected.waitingMinutes
                && third.id < selected.id)) {
            selected = third;
        }

        System.out.println("Selected Ticket: " + selected.id);
        System.out.println("Priority: " + selected.priority);
        System.out.println("Waiting Minutes: " + selected.waitingMinutes);
    }
}

class SupportTicket {

    int id;
    int priority;
    int waitingMinutes;
}
