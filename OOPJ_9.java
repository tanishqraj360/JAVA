// Write a program to illustrate creation of threads using runnable class. 
// (start method start each of the newly created thread. Inside the run method there is sleep() for suspend the thread for 500 milliseconds)

class ThreadExample implements Runnable {

    String threadName;

    ThreadExample(String name) {
        this.threadName = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
    }
}

public class OOPJ_9 {
    public static void main(String[] args) {
        ThreadExample r1 = new ThreadExample("Thread-1");
        ThreadExample r2 = new ThreadExample("Thread-2");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}