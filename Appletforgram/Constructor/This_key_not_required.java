
package Constructor;

class this3 {
    int id;
    int age;
    float sallary;

    this3(int i, int a, float s) {
        id = i;
        age = a;
        sallary = s;
    }

    void Display() {
        System.out.println(" " + id + " " + age + " " + sallary);
    }

}

public class This_key_not_required {

    public static void main(String[] args) {

        this3 t1 = new this3(22, 20, 200000);
        this3 t2 = new this3(23, 21, 400000);
        t1.Display();
        t2.Display();
    }

}
