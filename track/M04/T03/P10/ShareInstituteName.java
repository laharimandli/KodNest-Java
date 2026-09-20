
import java.util.Scanner;

public class ShareInstituteName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String instituteName = sc.nextLine();
        Learner.instituteName = instituteName;

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        Learner s1 = new Learner(name1);
        s1.display();

        Learner s2 = new Learner(name2);
        s2.display();
    }
}

class Learner {

    String learnerName;
    static String instituteName;

    Learner(String learnerName) {
        this.learnerName = learnerName;
    }

    void display() {
        System.out.println(learnerName + " - " + instituteName);
    }
}
