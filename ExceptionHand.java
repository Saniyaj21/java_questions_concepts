
public class ExceptionHand {
    public static void main(String[] args) {
        try {
            System.out.println("Sani");
            throw new ArithmeticException("Custom error");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("end");
        }
    }
}
