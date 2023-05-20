
class Address {
    static int Add(int a, int b) {
        return a + b;
    }

    static int Add(int a, int b, int c) {
        return a + b + c;
    }
}

class method_overloading_demo {

    public static void main(String[] args) {

        System.out.println(Address.Add(23, 12));
        System.out.println(Address.Add(23, 43));

    }
}