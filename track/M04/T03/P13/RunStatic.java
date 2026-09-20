
import java.util.Scanner;

public class RunStatic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Course c1 = new Course(name);
    }
}

class Course {

    static {
        System.out.println("Course class initialized");
    }

    Course(String name) {
        System.out.println("Created: " + name);
    }
}
