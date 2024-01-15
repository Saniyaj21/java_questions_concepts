class Sani extends Exception {
    Sani(String message) {
        super(message);
    }

}

public class CustomThrow {
    public static void main(String[] args) {
        try {
            System.out.println("Som");
            throw new Sani("Custom Sani");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
