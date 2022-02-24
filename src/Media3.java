import java.util.Locale;
import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        float n1, n2, n3, n4, media, notaExame, recalculoMedia;

        n1 = scan.nextFloat() * 2;
        n2 = scan.nextFloat() * 3;
        n3 = scan.nextFloat() * 4;
        n4 = scan.nextFloat() * 1;

        media = (n1+n2+n3+n4)/ 10;

        System.out.printf("Media: %.1f%n", media);
        if (media >= 7.0){
            System.out.println("Aluno aprovado.");
        }else if (media < 5.0){
            System.out.println("Aluno reprovado.");
        }else if (media >=5.0 && media <= 6.9){
            System.out.println("Aluno em exame.");
            notaExame = scan.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            recalculoMedia = (notaExame + media) / 2;
            if (recalculoMedia >= 5.0){
                System.out.println("Aluno aprovado.");
            }else if (recalculoMedia <= 4.9){
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", recalculoMedia);
        }
    }
}
