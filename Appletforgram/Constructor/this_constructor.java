package Constructor;

class C {

    C() {
        this(5);
        System.out.println("Hello c");
    }

    C(int x) {

        System.out.println(x);
    }
}

public class this_constructor {

    public static void main(String[] args) {

        C c = new C();

    }
}
