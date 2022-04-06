import java.util.Scanner;

public class somar {
    public static float calcula(float a, float b) {
        float resultado;
        resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) throws Exception {
        float n1, n2, r;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número");
        n1 = scan.nextFloat();

        System.out.println("Informe o segundo número");
        n2 = scan.nextFloat();

        r = calcula(n1, n2);

        System.out.println("O resultado é: " + r);
    }
}