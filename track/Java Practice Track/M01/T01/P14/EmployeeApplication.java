
import java.util.Scanner;

class EmployeeApplication {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        sc.nextLine();
        String email = sc.nextLine();
        Employee employee = new Employee(id, name, salary, email);
        employee.displayDetails();

    }
}

class Employee {

    int id;
    String name;
    double salary;
    String email;

    Employee(int id, String name, double salary, String email) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
    }

    void displayDetails() {
        System.out.println("Employee id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee email: " + email);
    }

    void updateName(String name) {
        this.name = name;
    }

}
