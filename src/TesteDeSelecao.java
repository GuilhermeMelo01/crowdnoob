import java.util.Scanner;

public class TesteDeSelecao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B, C, D;
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();
        scan.close();

        if ((B > C && D > A) && (C + D > A + B) && (C >= 1 && D >= 1) && (A % 2 == 0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
