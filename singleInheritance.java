class Animals {
    void eat() {
        System.out.println("this is a eating only Animals");

    }
}

class Dog extends Animals {
    void bark() {
        System.out.println("this is a barking dog");
    }
}

public class singleInheritance {
    public static void main(String[] args) {
        Animals a = new Animals();
        a.eat();
        Dog d = new Dog();
        d.bark();

    }
}
