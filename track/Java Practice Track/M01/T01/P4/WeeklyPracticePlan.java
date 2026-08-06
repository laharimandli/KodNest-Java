
public class WeeklyPracticePlan {

    public static void main(String[] args) {

        int practiceDays = 5;
        int sessionsPerDay = 2;
        int revisionDay = 3;
        int finalDaySessionLimit = 1;
        int targetSessions = 7;
        int completedSessions = 0;

        for (int days = 1; days <= practiceDays; days++) {

            if (days == revisionDay) {
                continue;
            }

            for (int sessions = 1; sessions <= sessionsPerDay; sessions++) {

                if (days == practiceDays && sessions > finalDaySessionLimit) {
                    break;
                }

                completedSessions++;

                System.out.println("Day " + days + " - Session " + sessions);
            }
        }

        System.out.println("Completed Sessions: " + completedSessions);

        System.out.println(
                completedSessions >= targetSessions
                        ? "Target Achieved"
                        : "Target Pending");
    }
}
