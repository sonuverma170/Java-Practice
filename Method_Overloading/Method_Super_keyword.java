
class Animals1 {
    void eat() {
        System.out.println("Hello World In the Bhai");
    }
}

class Dogs extends Animals1 {
    void eat() {
        System.out.println("eating.........");
    }

    void bark() {
        System.out.println("Barking .........");
    }

    void work() {
        super.eat();
        bark();
    }

}

public class Method_Super_keyword {

    public static void main(String[] args) {

        Dogs d2 = new Dogs();
        d2.work();
    }
}
