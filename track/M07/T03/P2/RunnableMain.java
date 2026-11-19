
import java.util.Scanner;

class RunnableMain {

    public static void main(String[] args) {

        /* Method - 1
        Addition ad = new Addition();
        PrintNum pn = new PrintNum();
        PrintChar pc = new PrintChar();

        Thread t1 = new Thread(ad);
        Thread t2 = new Thread(pn);
        Thread t3 = new Thread(pc);

        t1.start();
        t2.start();
        t3.start();
         */

 /* Method - 2
        Thread t1 = new Thread(new Addition());
        Thread t2 = new Thread(new PrintNum());
        Thread t3 = new Thread(new PrintChar());

        t1.start();
        t2.start();
        t3.start();

         */
        //Method - 3
        new Thread(new Addition()).start();
        new Thread(new PrintNum()).start();
        new Thread(new PrintChar()).start();

    }
}

class Addition implements Runnable {

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

class PrintNum implements Runnable {

    @Override
    public void run() {
        System.out.println("PrintNum Thread started...");
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        System.out.println("PrintNum Thread completed...");

    }

}

class PrintChar implements Runnable {

    @Override
    public void run() {
        System.out.println("PrintChar Thread started...");
        for (char i = 'A'; i < 'G'; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("PrintChar Thread completed...");

    }

}
