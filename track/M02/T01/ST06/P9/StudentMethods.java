
import java.util.Scanner;

public class StudentMethods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fullName = sc.nextLine();
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();

        Student student = new Student();

        student.setName(fullName);
        student.showName();
        student.showScore(score1);
        student.showScore(score1, score2);
    }
}

class Student {

    String name;

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Student Name: " + name);
    }

    void showScore(int first) {
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        System.out.println("Two-Score Total: " + (first + second));
    }
}
