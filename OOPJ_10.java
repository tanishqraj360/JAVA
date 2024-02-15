// Develop a program to create a class MyThread in this class a constructor, call the base class constructor, using super and start the thread. 
// The run method of the class starts after this. It can be observed that both main thread and created child thread are executed concurrently.

class MyThread implements Runnable {

    MyThread() {
        super();
    }

    public void run() {
        System.out.println("Child thread is running...");
    }
}

public class OOPJ_10 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        t1.start();

        System.out.println("Main thread is running...");
    }
}