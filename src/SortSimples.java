import java.util.*;

public class SortSimples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int v1, v2, v3;

        v1 = scan.nextInt();
        v2 = scan.nextInt();
        v3 = scan.nextInt();

        int [] array = {v1, v2, v3};

        Arrays.sort(array);

        for (int i : array) {
            System.out.println(i);
        }

        System.out.println("");
        System.out.println(v1+"\n"+ v2 +"\n"+ v3);

        scan.close();

    }
}
