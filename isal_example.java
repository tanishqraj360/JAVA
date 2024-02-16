
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