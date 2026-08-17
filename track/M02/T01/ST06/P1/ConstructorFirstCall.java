
public class ConstructorFirstCall {

    public static void main(String[] args) {
        // Create one Robot object
        Robot robot = new Robot();
    }
}

class Robot {

    Robot() {
        // Print the message
        System.out.println("Beep beep! Robot reporting for Java duty!");
    }
}
