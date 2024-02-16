
class b extends Thread {

    public void run() {
        System.out.println("isAlive method program...!");
    }

}

public class isal_example {
    public static void main(String[] args) {
        b t1 = new b();
        b t2 = new b();

        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());

        System.out.println(t2.isAlive());
        t2.start();
        System.out.println(t2.isAlive());

    }

}

/*
 * isAlive() is a pre-defined method of thread class through which we can verify
 * whether a thread isAlive or not.
 * 
 * i) if thread isAlive and it will return true otherwise false
 * ii)if we use isAlive method before start method then it will print false but
 * after start method it will print true
 */