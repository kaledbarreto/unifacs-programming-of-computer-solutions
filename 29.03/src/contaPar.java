import java.util.Scanner;

public class contaPar {
    public static int contaPar(float a, float b) {
        int cont = 0;

        while (a < b) {
            if (a % 2 == 0) {
                cont++;
            }
            a++;
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

        r = contaPar(n1, n2);

        System.out.println("O resultado é: " + r);
    }
}
