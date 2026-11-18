
import java.util.Scanner;

class ThreadMain {

    public static void main(String args[]) {
        Addition ad = new Addition();
        PrintNum pn = new PrintNum();
        PrintChar pc = new PrintChar();

        ad.start();
        pn.start();
        pc.start();
    }
}

class Addition extends Thread {

    @Override
    public void run() {
        System.out.println("Addition Thread started...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int res = a + b;
        System.out.println("Result: " + res);
        System.out.println("Addition Thread completed...");

    }

}

class PrintNum extends Thread {

    @Override
    public void run() {
        System.out.println("PrintNum Thread started...");
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(30000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        System.out.println("PrintNum Thread completed...");

    }

}

class PrintChar extends Thread {

    @Override
    public void run() {
        System.out.println("PrintChar Thread started...");
        for (char i = 'A'; i < 'G'; i++) {
            System.out.println(i);
            try {
                Thread.sleep(30000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("PrintChar Thread completed...");

    }

}
