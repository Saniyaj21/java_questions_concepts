class A implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadRunable {
    // A obj = new A();
    // B obj1 = new B();

    public static void main(String[] args) {
        A obj = new A();
        Thread a1 = new Thread(obj);
        Thread b1 = new Thread(new B());
        a1.start();
        b1.start();
    }

}
