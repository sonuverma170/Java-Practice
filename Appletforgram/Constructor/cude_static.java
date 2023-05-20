package Constructor;

class calculate {
    static int cube(int x) {

        return x * x * x;
    }
}

public class cude_static {

    public static void main(String[] args) {
        int result = calculate.cube(5);

        System.out.println(result);

    }
}
