import java.util.Locale;
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int codigo, quantidade;
        double valor;

        codigo = scan.nextInt();
        quantidade = scan.nextInt();

        switch (codigo) {
            case 1 -> {
                valor = quantidade * 4.00;
                System.out.printf("Total: R$ %.2f\n", valor);
            }
            case 2 -> {
                valor = quantidade * 4.50;
                System.out.printf("Total: R$ %.2f\n", valor);
            }
            case 3 -> {
                valor = quantidade * 5.00;
                System.out.printf("Total: R$ %.2f\n", valor);
            }
            case 4 -> {
                valor = quantidade * 2.00;
                System.out.printf("Total: R$ %.2f\n", valor);
            }
            case 5 -> {
                valor = quantidade * 1.50;
                System.out.printf("Total: R$ %.2f\n", valor);
            }
        }
        scan.close();
    }
}
