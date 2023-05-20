package Constructor;

class Static {
    int id;
    String name;
    static String College = "PSRIET";

    Static(int i, String n) {
        id = i;
        name = n;
    }

    void Display() {
        System.out.println("Static OP:- " + id + " " + name + " " + College);
    }
}

public class Static_keyword {

    public static void main(String[] args) {

        Static s1 = new Static(122, "Sonu");
        Static s2 = new Static(124, "SonuVerma");

        s1.Display();
        s2.Display();
    }
}
