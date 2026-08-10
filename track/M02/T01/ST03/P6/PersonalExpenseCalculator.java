
import java.util.Scanner;

public class PersonalExpenseCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double monthlyIncome = scanner.nextDouble();
        double rentExpense = scanner.nextDouble();
        double foodExpense = scanner.nextDouble();
        double travelExpense = scanner.nextDouble();

        double total = foodExpense + rentExpense + travelExpense;
        double rem = monthlyIncome - total;

        System.out.println("Total expense: " + total);
        System.out.println("Remaining: " + rem);

        String status = "";

        if (rem >= 0) {
            status = "Within budget";
        } else {
            status = "Over budget";
        }

        System.out.println("Status: " + status);

        scanner.close();
    }
}
