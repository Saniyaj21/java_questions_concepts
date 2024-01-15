class InnerParameterizeCons {
    int age;
    String name;

    InnerParameterizeCons(int age, String name) {
        this.age = age;
        this.name = name;
    }

}

public class ParameterizeCons {
public static void main(String[] args) {
    InnerParameterizeCons obj = new InnerParameterizeCons(22, "saniyaj");
    System.out.println(obj.age);
    System.out.println(obj.name);
}
}
