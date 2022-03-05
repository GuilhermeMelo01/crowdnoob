import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double A, B, C;

        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();

        if((A+B > C) && (A+C > B) && (B+C > A)){
            double perimetro = (A+B+C);
            System.out.printf("Perimetro = %.1f%n", perimetro);
        }else{
            double area  = ((A+B) * C) / 2;
            System.out.printf("Area = %.1f%n", area);
        }
        scan.close();
    }
}
