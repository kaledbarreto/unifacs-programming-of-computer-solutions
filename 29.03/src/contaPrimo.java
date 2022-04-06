import java.util.Scanner;

public class contaPrimo {
    public static int contaPrimo(int a, int b) {
        int cont = 0, div = 0, i, j;

        for (i = a; i < b; i++) {
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    div++;
                }
            }
            if (div == 2) {
                cont++;
            }
            div = 0;
        }
        return cont;
    }

    public static void main(String[] args) throws Exception {
        int n1, n2, r;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        n1 = scan.nextInt();

        System.out.println("Informe o segundo número:");
        n2 = scan.nextInt();

        r = contaPrimo(n1, n2);

        System.out.println("O resultado é: " + r);
    }
}
