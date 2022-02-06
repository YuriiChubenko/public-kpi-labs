public class App {
    public static void main(String[] args) {

        // Task constants
        final int C2 = 1;
        final int C3 = 1;
        final int C5 = 1;
        final int C7 = 5;
        final int C = C3;

        int a = 0;
        int b = 0;
        int m = 0;
        int n = 0;

        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            n = Integer.parseInt(args[2]);
            m = Integer.parseInt(args[3]);

        } catch (Exception e) {
            throw new IllegalArgumentException("Method expected 4 integers as argument");

        }

        if (a > n || b > m) {
            throw new IllegalArgumentException("Sum rule breached");
        }

        try {
            float s = 0;
            for (float i = a; i <= n; i++) {
                if (i + C == 0) {
                    throw new ArithmeticException("Division by zero (i+C = 0).");
                }
                for (float j = b; j <= m; j++) {
                    if (j == 0) {
                        throw new ArithmeticException("Division by zero (j = 0).");
                    }
                    s += (i / j) / (i - C);
                }
            }
            System.out.println("Computation done. Result: " + s);
        } catch (Exception e) {
            System.out.println("Computation interrupted. Reason: " + e.getMessage());
        }

    }
}
