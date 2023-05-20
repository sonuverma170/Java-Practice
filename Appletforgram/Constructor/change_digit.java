package Constructor;

class Student8 {
    int id;
    String name;
    static String college = "IPBM";

    static void change() {
        college = "PSRIET";
    }

    Student8(int i, String n) {
        id = i;
        name = n;
    }

    void Display() {
        System.out.println(id + " " + name + " " + college);
    }

}

public class change_digit {

    public static void main(String[] args) {
        Student8.change();
        Student8 s1 = new Student8(100, "Sonu");
        Student8 s2 = new Student8(101, "SonuVerma");
        Student8 s3 = new Student8(102, "SonuVerma");

        s1.Display();
        s2.Display();
        s3.Display();
    }
}
