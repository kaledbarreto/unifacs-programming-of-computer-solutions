import java.util.Scanner;

public class verificaPrimo {
    public static void main(String[] args) throws Exception {
        int vetor[] = new int[8];
        int cont = 0, div = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.println("Informe o  " + i + "° número:");
            vetor[i] = scan.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            System.out.println("[" + vetor[i] + "]");
            for (int j = 1; j <= vetor[i]; j++) {
                if (vetor[i] % j == 0) {
                    div++;
                }
            }

            if (div == 2) {
                System.out.println("O número " + vetor[i] + " é primo e está na posição " + i);
            }
            div = 0;
        }
    }
}
