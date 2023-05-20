class fibonacise_series {

    static int a1 = 0, a2 = 1, a3 = 0;

    static void fibo(int count) {
        if (count > 0) {
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
            System.out.println(" " + a3);
            System.out.println(count - 1);
        }

    }

    public static void main(String[] args) {

        int count = 10;
        System.out.println(a1 + " " + a2);
        System.out.println(count - 2);
    }
}
