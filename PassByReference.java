class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}



public class PassByReference {
    public static void main(String[] args) {
        
        MyClass obj = new MyClass(10);
        System.out.println("Before: " + obj.getValue());
        modifyObject(obj);
        System.out.println("After: " + obj.getValue());
    }


    static void modifyObject(MyClass myObj) {
        myObj.setValue(20);
        System.out.println("Inside method: " + myObj.getValue());
    }
}

