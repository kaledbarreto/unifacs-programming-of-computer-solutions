import java.util.Scanner;

public class concatenaVetor {
    public static void main(String[] args) throws Exception {
        int vetor1[] = new int[5], vetor2[] = new int[5], vetor3[] = new int[10];
        int j = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o " + i + "° número do vetor 01:");
            vetor1[i] = scan.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o " + i + "° número do vetor 02:");
            vetor2[i] = scan.nextInt();
        }

        for (int i = 0; i < 10; i += 2) {
            vetor3[i] = vetor1[j];
            vetor3[i + 1] = vetor2[j];
            j++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("[" + vetor3[i] + "]");
        }
    }
}
