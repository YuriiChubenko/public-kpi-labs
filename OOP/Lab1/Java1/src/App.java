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

            if ((a - C <= 0) && (n - C >= 0)) {
                throw new ArithmeticException("Division by zero predicted (i+C = 0).");
            }
            if (b <= 0 && m >= 0) {
                throw new ArithmeticException("Division by zero predicted (j = 0).");
            }

            float s = 0;

            for (float i = a; i <= n; i++) {
                for (float j = b; j <= m; j++) {
                    s += (i / j) / (i - C);
                }
            }

            System.out.println(s);

        } catch (Exception e) {
            throw new RuntimeException("Computation interrupted. Reason: " + e.getMessage());
        }

    }
}
