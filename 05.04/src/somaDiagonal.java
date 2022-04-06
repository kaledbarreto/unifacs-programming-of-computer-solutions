import java.util.Scanner;

public class somaDiagonal {
    public static void main(String[] args) throws Exception {
        int matriz[][] = new int[4][4];
        int dig1 = 0, dig2 = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Informe o número da matriz[" + i + "][" + j + "]:");
                matriz[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    dig1 = dig1 + matriz[i][j];
                }

                if (i + j == matriz.length - 1) {
                    dig2 = dig2 + matriz[i][j];
                }
            }
        }

        System.out.println("A soma da diagonal principal é: " + dig1);
        System.out.println("A soma da diagonal secundaria é: " + dig2);
    }
}
