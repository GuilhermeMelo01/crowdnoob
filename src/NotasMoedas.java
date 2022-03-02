import java.util.Locale;
import java.util.Scanner;

public class NotasMoedas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        float valor;
        int[] cedulas = {100, 50, 20, 10, 5, 2};
        int[] moedas = {100, 50, 25, 10, 5, 1};
        int resto, quociente;
        valor = scan.nextFloat();

        resto = (int) (valor * 100 + 5);

        System.out.println("NOTAS:");
        for (float cedula : cedulas) {
            quociente = (int) (resto / (cedula * 100));
            System.out.printf(quociente + " nota(s) de R$ %.2f%n", cedula);
            resto %= (cedula * 100);
        }

        System.out.println("MOEDAS:");
        for (float moeda : moedas) {
            quociente = (int) (resto / moeda);
            System.out.printf(quociente + " moedas(s) de R$ %.2f%n", moeda / 100);
            resto %= moeda;
        }
        scan.close();
    }

}

