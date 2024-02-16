class a3 extends Thread {
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(n);
        }
    }
}

public class join_example {
    public static void main(String[] args) {
        a3 t1 = new a3();
        a3 t2 = new a3();
        a3 t3 = new a3();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t2.start();
        try {
            t2.join();
        } catch (InterruptedException i) {

        }
        t1.start();
        t3.start();
        String n = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(n);
        }

    }

}