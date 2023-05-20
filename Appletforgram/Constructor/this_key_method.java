package Constructor;

class A {
    void m() {
        System.out.println("hello m");
    }

    void n() {
        System.out.println("hello n");
        this.m();
    }
}

public class this_key_method {

    public static void main(String[] args) {

        A a = new A();
        a.n();
    }
}
