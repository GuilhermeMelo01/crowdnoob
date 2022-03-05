import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.*;

public class TiposDeTriangulos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double A, B, C;

        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();

        List<Double> lista = new ArrayList<>(List.of(A, B, C));
        lista.sort(Collections.reverseOrder());

        A = lista.get(0);
        B = lista.get(1);
        C = lista.get(2);

//        System.out.println(A);
//        System.out.println(B);
//        System.out.println(C);


        for (double aFloat : lista) {
            System.out.println(aFloat);
        }


        if (A  >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        if ((Math.pow(A, 2)) == (Math.pow(B, 2)) + (Math.pow(C, 3))) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if ((Math.pow(A, 2)) > (Math.pow(B, 2)) + (Math.pow(C, 3))) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if ((Math.pow(A, 2)) < (Math.pow(B, 2)) + (Math.pow(C, 3))) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (A == C && B == C) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if (A == B && B != C || C == A && A != B || C == B && B != A) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }

}
