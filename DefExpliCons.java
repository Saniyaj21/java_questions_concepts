
class InnerDefExpliCons {
    int age;
    String name;

    InnerDefExpliCons(String name) {
        this.name = name;
    }
    InnerDefExpliCons(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class DefExpliCons {
    public static void main(String[] args) {
        InnerDefExpliCons obj = new InnerDefExpliCons("SAniyaj");
        InnerDefExpliCons obj2 = new InnerDefExpliCons("sombhu", 90);
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj2.name);
        System.out.println(obj2.age);
    }
}
