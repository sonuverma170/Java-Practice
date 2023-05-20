package Constructor;

class Student5 {
    int id;
    String name;
    float Salary;

    Student5(int i, String n) {
        id = i;
        name = n;

    }

    Student5(int i, String n, float s) {
        id = i;
        name = n;
        Salary = s;

    }

    void Display() {
        System.out.println("Param:-" + id + "" + name + "" + Salary);
    }
}

public class Overloading_Constructor {
    public static void main(String[] args) {
        Student5 s1 = new Student5(1001, "Sonu");
        Student5 s2 = new Student5(1002, " Monu", 500000);
        s1.Display();
        s2.Display();

    }
}