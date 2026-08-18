
import java.util.Scanner;

public class DefaultEmployee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        Employee employee = new Employee();
        employee.name = name;

        employee.displayProfile();
    }
}

class Employee {

    String name;
    String role;

    Employee() {
        role = "Trainee";
    }

    void displayProfile() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Role: " + role);
    }
}
