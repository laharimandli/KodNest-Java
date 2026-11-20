
class SynchronisedThread {

    public static void main(String args[]) {
        Printer pr = new Printer();
        Thread t1 = new Thread(pr);
        Thread t2 = new Thread(pr);
        Thread t3 = new Thread(pr);

        t1.setName("Java Developer");
        t2.setName("Python Developer");
        t3.setName("C Developer");

        t1.start();
        t2.start();
        t3.start();

    }

}

class Printer implements Runnable {

    @Override
    synchronized public void run() {

        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " started using Printer");
            Thread.sleep(3000);
            System.out.println(threadName + " still using Printer");
            Thread.sleep(3000);
            System.out.println(threadName + " Stopped using Printer");
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
