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

class cat extends Animals {
    void mauu() {
        System.out.println("this is small cat sound");
    }
}

public class multilevelInheritance {
    public static void main(String[] args) {
        cat ca = new cat();
        ca.eat();
        ca.mauu();
    }
}
