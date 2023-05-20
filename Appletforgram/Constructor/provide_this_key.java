package Constructor;

class D {
    void m() {
        System.out.println(this);// refer the Same Refirence Id
    }

}

public class provide_this_key {

    public static void main(String[] args) {

        D a = new D();
        System.out.println(a);// print same Reference id
        a.m();
    }
}
