import java.util.Scanner;

public class serie {
    public static float serie(int a, int b) {
        float result = 0, aux = 0;

        int numerador = a, denominador = b;

        while (denominador < )
        return result;
    }

    public static void main(String[] args) throws Exception {
        int n1, n2;
        float r;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        n1 = scan.nextInt();

        System.out.println("Informe o segundo número:");
        n2 = scan.nextInt();

        r = serie(n1, n2);

        System.out.println("O resultado é: " + r);
    }
}