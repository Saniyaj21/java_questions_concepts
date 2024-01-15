public class PassByValue {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Before: " + x);
        modifyValue(x);
        System.out.println("After: " + x);
    }

    static void modifyValue(int num) {
        num = 20;
        System.out.println("Inside method: " + num);
    }
}
