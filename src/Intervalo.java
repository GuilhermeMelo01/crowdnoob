import java.util.Locale;
import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        float numero;
        numero = scan.nextFloat();

        if (numero >= 0.0000 && numero <= 25.0000) {
            System.out.println("Intervalo [0,25]");
        } else if (numero >= 25.00001 && numero <= 50.0000) {
            System.out.println("Intervalo [25,50]");
        } else if (numero >= 50.00001 && numero <= 75.0000) {
            System.out.println("Intervalo [50,75]");
        } else if (numero >= 75.00001 && numero <= 100.00000) {
            System.out.println("Intervalo [75,100]");
        } else {
            System.out.println("Fora do intervalo");
        }

    }
}
