
class Address1 {
    static int Add1(int a, int b) {
        return a + b;
    }

    static double Add1(Double a, Double b) {
        return a + b;
    }
}

public class Overloading_datype_change {

    public static void main(String[] args) {

        System.out.println(Address1.Add1(12, 32));
        System.out.println(Address1.Add1(23, 32));
    }
}
