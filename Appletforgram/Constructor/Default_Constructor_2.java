package Constructor;

class Student1 {
    int id;
    String name;

    void Display() {
        System.out.println("Second Default constructor:---" + id + " " + name);
    }
}

public class Default_Constructor_2 {

    public static void main(String[] args) {

        Student1 s1 = new Student1();
        Student1 s2 = new Student1();

        s1.Display();
        s2.Display();
    }

}
