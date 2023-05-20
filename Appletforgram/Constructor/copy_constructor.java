package Constructor;

class Student6 {
    int id;
    int age;

    Student6(int i, int a) {
        id = i;
        age = a;
    }

    Student6(Student6 s) {
        id = s.id;
        age = s.age;

    }

    void Display() {
        System.out.println("cpy cunstructor:--" + id + " " + age);
    }

}

public class copy_constructor {

    public static void main(String[] args) {

        Student6 s6 = new Student6(1002, 23);
        Student6 s7 = new Student6(s6);
        s6.Display();
        s7.Display();
    }
}
