import java.util.Locale;
import java.util.Scanner;

public class FormulaDeBaskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double A, B, C;
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        double delta = Math.pow(B, 2) - 4 * A * C;

        if (A <= 0 || delta <= 0) {
            System.out.println("Impossivel calcular");
        } else {
            double x1 = (-B + Math.sqrt(delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        }
    }
}
