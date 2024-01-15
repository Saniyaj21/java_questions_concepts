interface InnerInterfaceExample {
    void printName();
}

class Example implements InnerInterfaceExample {
    public void printName() {
        System.out.println("Saniyaj");
    }

}

public class InterfaceExample {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.printName();
        
    }
}
