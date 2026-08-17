
import java.util.Scanner;

public class StudentRegistration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create and populate firstStudent
        Student s1 = new Student();
        s1.registrationId = sc.nextInt();
        sc.nextLine();
        s1.name = sc.nextLine();
        s1.attendancePercentage = sc.nextDouble();

        // Create and populate secondStudent
        Student s2 = new Student();
        s2.registrationId = sc.nextInt();
        sc.nextLine();
        s2.name = sc.nextLine();
        s2.attendancePercentage = sc.nextDouble();

        Student selectedStudent = null;
        // Read the selected ID and new attendance
        int selectedId = sc.nextInt();
        double newAttendance = sc.nextDouble();

        // Make selectedStudent refer to the matching existing object
        if (selectedId == s1.registrationId) {
            selectedStudent = s1;
        } else if (selectedId == s2.registrationId) {
            selectedStudent = s2;
        }

        // Update through selectedStudent when a match exists
        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }
        // Display both records
        System.out.println("Selected Student: " + selectedStudent.name);
        System.out.println(s1.registrationId + " - " + s1.name + " - " + s1.attendancePercentage + "%");
        System.out.println(s2.registrationId + " - " + s2.name + " - " + s2.attendancePercentage + "%");
    }
}

class Student {

    // Declare registrationId, name and attendancePercentage
    int registrationId;
    String name;
    double attendancePercentage;
}
