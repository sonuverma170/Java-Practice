
class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "Black";

    void Printcolor() {
        System.out.println(color);
        System.out.println(super.color);
    }

}

public class Super_key_demo {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.Printcolor();
    }
}
