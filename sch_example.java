class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class Thread1 extends Thread {
    public void start(Counter counter) {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

class Thread2 extends Thread {
    public void start(Counter counter) {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class sch_example {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start(counter);
        t2.start(counter);

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
