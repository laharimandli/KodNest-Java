
import java.util.Scanner;

public class StudentUtilityMethods {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentUtility utility = new StudentUtility();

        int studentId = sc.nextInt();
        sc.nextLine();

        String name = sc.nextLine();

        int javaScore = sc.nextInt();
        int sqlScore = sc.nextInt();

        utility.showReportTitle();
        utility.displayStudent(studentId, name);

        double percentage
                = utility.calculatePercentage(javaScore, sqlScore);

        System.out.println("Percentage: " + percentage);

        if (percentage >= utility.getPassingPercentage()) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: NEEDS IMPROVEMENT");
        }

        sc.close();
    }
}

class StudentUtility {

    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    double getPassingPercentage() {
        return 60.0;
    }

    double calculatePercentage(int javaScore, int sqlScore) {
        return (javaScore + sqlScore) / 2.0;
    }
}
