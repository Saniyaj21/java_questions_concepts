public class ThrowsExample {
    public static void sum(int a, int b) throws ArrayIndexOutOfBoundsException {

        // try {
        // System.out.println(2 / 0); // This line throws ArithmeticException
        // } catch (Exception e) {
        // System.out.println(e);
        // }
        // Initializing with values
        
        int[] days = { 1, 2, 3, 4, 5 };
        System.out.println(days[10]);
        System.out.println(2 / 0);

    }

    public static void main(String[] args) {
        sum(2, 2);
       
    }
}
