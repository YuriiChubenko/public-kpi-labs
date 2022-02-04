public class App {
    public static void main(String[] args) {
        final int C2 = 1;
        final int C3 = 1;
        final int C5 = 1;
        final int C7 = 5;
        final int C = C3;
        int a = 0;
        int b = 0;
        int m = 0;
        int n = 0;
        boolean error = false;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            n = Integer.parseInt(args[2]);
            m = Integer.parseInt(args[3]);
        } catch (Exception e) {
            System.out.println("Method expected 4 integers as argument");
            error = true;

        }

        float s = 0;
        if (!error) {
            for (float i = a; i <= n; i++) {
                if (i + C == 0) {
                    System.out.println("Error! Division by zero.");
                    error = true;
                    break;
                }
                for (float j = b; j <= m; j++) {
                    s += (i / j) / (i - C);
                }
            }
            if (!error) {
                System.out.println(s);
            }
        }

        else {
            System.out.println("Computation interrupted");
        }

    }
}
