
public class SynchronizedBlock {

    public static void main(String args[]) {
        Hospital hs = new Hospital();
        Thread t1 = new Thread(hs);
        Thread t2 = new Thread(hs);
        t1.setName("TOM");
        t2.setName("Jerry");
        t1.start();
        t2.start();

    }
}

class Hospital implements Runnable {

    String res1 = "Bed";
    String res2 = "Doctor";

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("TOM")) {
            tomTreatment();
        } else {
            jerryTreatment();
        }

    }

    void tomTreatment() {
        synchronized (res1) {
            try {
                System.out.println("Tom using " + res1);
                Thread.sleep(3000);
                synchronized (res2) {
                    try {
                        System.out.println("TOM using " + res2);
                        Thread.sleep(3000);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("TOM released using " + res2);

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("TOM released using " + res1);

        }

    }

    void jerryTreatment() {
        synchronized (res2) {
            try {
                System.out.println("Jerry using " + res2);
                Thread.sleep(3000);
                synchronized (res1) {
                    try {
                        System.out.println("Jerry using " + res1);
                        Thread.sleep(3000);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Jerry released using " + res1);

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Jerry released using " + res2);

        }

    }

}
