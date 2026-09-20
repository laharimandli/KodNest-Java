
import java.util.Scanner;

public class CallInstanceStaticMethods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();

        Message m1 = new Message(msg);
        m1.displayText();
        Message.displayCourse();
    }
}

class Message {

    String text;
    static String course = "Java";

    Message(String text) {
        this.text = text;
    }

    void displayText() {
        System.out.println("Message: " + text);
    }

    static void displayCourse() {
        System.out.println("Course: " + course);
    }
}
