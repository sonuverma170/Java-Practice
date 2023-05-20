
package Constructor;

class this2 {
    int id;
    int age;
    float sallary;

    this2(int id, int age, float sallary) {
        this.id = id;
        this.age = age;
        this.sallary = sallary;
    }

    void Display() {
        System.out.println(" " + id + " " + age + " " + sallary);
    }

}

public class this_with_variable {

    public static void main(String[] args) {

        this2 t1 = new this2(12, 20, 200000);
        this2 t2 = new this2(13, 20, 400000);
        t1.Display();
        t2.Display();
    }

}
