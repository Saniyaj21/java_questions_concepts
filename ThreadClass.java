class A1 extends Thread {
 
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

class B1 extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
public class ThreadClass {
    public static void main(String[] args) {
        A1 obj1 = new A1();
        B1 obj2 = new B1();
        obj1.start();
        obj2.start();
    }
}
