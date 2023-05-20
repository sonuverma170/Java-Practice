package Constructor;

class Student4 {
    int id;
    String name;

    Student4(int i, String n) {
        id = i;
        name = n;
    }

    void Display() {
        System.out.println("Param:-" + id + "" + name);
    }
}

public class Parameter_constructor {
    public static void main(String[] args) {
        Student4 s1 = new Student4(1001, "Sonu");
        Student4 s2 = new Student4(1002, " Monu");
        s1.Display();
        s2.Display();

    }

}
