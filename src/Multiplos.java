import java.util.Locale;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double a, b;

        a = scan.nextDouble();
        b = scan.nextDouble();

        if (a%b == 0 || b%a == 0) {
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
        scan.close();
    }
}
