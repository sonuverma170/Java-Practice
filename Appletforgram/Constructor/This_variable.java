package Constructor;

class this1 {
    int ids;
    int age;
    float sallary;

    this1(int ids, int age, float sallary) {
        ids = ids;
        age = age;
        sallary = sallary;

    }

    void Display() {
        System.out.println(" " + ids + " " + age + " " + sallary);
    }

}

public class This_variable {

    public static void main(String[] args) {

        this1 t1 = new this1(12, 220, 200000);
        this1 t2 = new this1(12, 220, 200000);
        t1.Display();
        t2.Display();
    }

}
