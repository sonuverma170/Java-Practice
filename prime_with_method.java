
public class prime_with_method {

    static void checkprime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + "is not a prime Number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + "is not a prime");
                    flag = 1;
                    break;

                }
            }
        }
        if (flag == 0) {

            System.out.println(n + "is prime number");

        }

    }

    public static void main(String[] args) {
        checkprime(3);
        checkprime(9);
        checkprime(13);
        checkprime(16);
    }
}
