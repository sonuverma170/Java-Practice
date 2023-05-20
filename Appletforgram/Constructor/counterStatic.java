package Constructor;

class Counter1 {

    static int count = 0;

    Counter1() {
        count++;
        System.out.println(count);
    }

}

public class counterStatic {

    public static void main(String[] args) {

        Counter1 s3 = new Counter1();
        Counter1 s4 = new Counter1();
        Counter1 s5 = new Counter1();
    }

}
