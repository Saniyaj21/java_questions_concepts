class Car {
    String model;
    int year;

    // Default constructor
    Car() {
        this("Unknown", 0); // Call parameterized constructor
    }

    // Parameterized constructor
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

public class ConsChanning {
    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println(obj.model);
        Car obj2 = new Car("Sani", 22);
        System.out.println(obj2.model);
    }
}
