
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
            treatment(threadName);
        } else {
            treatment(threadName);
        }

    }

    void treatment(String threadName) {
        synchronized (res1) {
            try {
                System.out.println(threadName + " using " + res1);
                Thread.sleep(3000);
                synchronized (res2) {
                    try {
                        System.out.println(threadName + " using " + res2);
                        Thread.sleep(3000);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(threadName + " released using " + res2);

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " released using " + res1);

        }

    }

}
