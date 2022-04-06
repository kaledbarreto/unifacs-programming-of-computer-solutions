import java.util.Scanner;

public class maiorMatriz {
    public static void main(String[] args) throws Exception {
        int matriz[][] = new int[3][3];
        int maior = 0, maiorLinha = 0, maiorColuna = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Informe o número da matriz[" + i + "][" + j + "]:");
                matriz[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    maiorLinha = i;
                    maiorColuna = j;
                }
            }
        }

        System.out.println(
                "O maior número é " + maior + " e esta localizado em matriz[" + maiorLinha + "][" + maiorColuna + "]");
    }
}
