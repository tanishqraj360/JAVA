class PriorityThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class priority_example {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();

        t1.setName("t1 thread");
        t2.setName("t2 thread");
        t3.setName("t3 thread");

        t1.setPriority(2);
        t2.setPriority(6);
        t3.setPriority(8);

        t1.start();
        t2.start();
        t3.start();
    }
}
