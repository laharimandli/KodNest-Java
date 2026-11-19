
import java.util.Scanner;

class ThreadMain {

    public static void main(String args[]) {
        Activity a1 = new Activity();
        Activity a2 = new Activity();
        Activity a3 = new Activity();

        a1.setName("ADD");
        a2.setName("CHAR");
        a3.setName("NUM");

        a1.start();
        a2.start();
        a3.start();

    }
}

class Activity extends Thread {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("ADD")) {
            addition();
        } else if (threadName.equals("CHAR")) {
            printChar();
        } else {
            printNum();
        }
    }

    void addition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition Thread Started and Using File");
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int res = a + b;
        System.out.println("Result: " + res);
        System.out.println("Addition Thread Completed and Stoppes Using File");
    }

    void printChar() {
        System.out.println("PrintNum Thread Started and Using File");
        for (char i = 'A'; i < 'F'; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
        System.out.println("PrintNum Thread Completed and Stoppes Using File");

    }

    void printNum() {
        System.out.println("PrintNum Thread Started and Using File");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
        System.out.println("PrintNum Thread Completed and Stoppes Using File");
    }
}
