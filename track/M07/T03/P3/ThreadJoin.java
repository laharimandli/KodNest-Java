
import java.util.Scanner;

class ThreadJoin {

    public static void main(String[] args) {
        System.out.println("Main Thread Started and Opened File");
        Addition ad = new Addition();
        PrintNum pn = new PrintNum();
        PrintChar pc = new PrintChar();

        ad.start();
        pn.start();
        pc.start();

        try {
            ad.join();
            pn.join();
            pc.join();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread Completed and Closed File");

    }
}

class Addition extends Thread {

    @Override
    public void run() {
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
}

class PrintNum extends Thread {

    @Override
    public void run() {
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

class PrintChar extends Thread {

    @Override
    public void run() {
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
}
