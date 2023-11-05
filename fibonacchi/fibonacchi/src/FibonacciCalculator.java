public class FibonacciCalculator {
    public static long fibonacciRec(int n) {
        if (n < 0) {
            System.out.println("Érvénytelen bemenet");
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRec(n - 1) + fibonacciRec(n - 2);
        }
    }

    public static long fibonacci(int n) {
        if (n < 0) {
            System.out.println("Érvénytelen bemenet");
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            long a = 0, b = 1;
            for (int i = 2; i <= n; i++) {
                long temp = a;
                a = b;
                b = temp + b;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci(" + n + ") rekurzív: " + fibonacciRec(n));
        System.out.println("Fibonacci(" + n + ") ciklussal: " + fibonacci(n));
    }
}

