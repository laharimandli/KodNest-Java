
public class DisplayPracticeReport {

    public static void main(String[] args) {

        int solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;
        double reportValue = solvedProblems;
        int wholePercentage = (int) exactPercentage;
        double average = (double) solvedProblems / practiceDays;
        boolean targetReached = average >= 9.0;
        System.out.println("Report Value: " + reportValue);
        System.out.println("Whole Percentage: " + wholePercentage);
        System.out.println("Average Per Day: " + average);
        System.out.println("Daily Target Reached: " + targetReached);
    }
}
