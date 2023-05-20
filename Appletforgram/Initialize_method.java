class Student1 {
    int id;
    float Salary;

    void Student2(int i, float s) {
        id = i;
        Salary = s;
    }

    void Display() {
        System.out.println(id + " " + Salary);
    }
}

class Student3 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        s1.Student2(200, 20000);
        s2.Student2(201, 40000);
        s1.Display();
        s2.Display();
    }

}
