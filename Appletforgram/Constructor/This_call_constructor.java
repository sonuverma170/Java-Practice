package Constructor;

class Name {
    int a;
    int age;
    String add;
    float sallary;

    Name(int a, int age, String add) {
        this.a = a;
        this.age = age;
        this.add = add;
    }

    Name(int a, int age, String add, float sallary) {
        this(a, age, add);
        this.sallary = sallary;
    }

    void Display() {
        System.out.println("Call_Conruct:-" + a + " " + age + " " + add + " " + sallary);
    }
}

public class This_call_constructor {

    public static void main(String[] args) {

        Name n1 = new Name(11, 22, "jogipur");
        Name n2 = new Name(11, 22, "jogipur", 200000);

        n1.Display();
        n2.Display();

    }
}
