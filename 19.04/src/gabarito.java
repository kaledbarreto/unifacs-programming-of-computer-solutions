import java.util.Scanner;

public class gabarito {
    public static void main(String[] args) throws Exception {
        int qntAlunos = 0, nota = 0, maior = 0, maiorIndice = 0, qtdQuestoes = 5;
        int vetorrespostas[] = new int[qtdQuestoes], alunorespostas[] = new int[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < qtdQuestoes; i++) {
            System.out.print("Gabarito - Questão " + (i + 1) + ": ");
            vetorrespostas[i] = scan.nextInt();
        }

        System.out.println("");
        System.out.print("Quantos alunos fizeram a prova? ");
        qntAlunos = scan.nextInt();
        System.out.println("");

        for (int i = 0; i < qntAlunos; i++) {
            nota = 0;
            for (int j = 0; j < qtdQuestoes; j++) {
                System.out.print("Aluno " + (i + 1) + " - Questão " + (j + 1) + ": ");
                alunorespostas[j] = scan.nextInt();
            }

            for (int j = 0; j < qtdQuestoes; j++) {
                if (alunorespostas[j] == vetorrespostas[j]) {
                    nota++;
                }
            }

            if (nota > maior) {
                maior = nota;
                maiorIndice = i + 1;
            }
            System.out.println("");
        }

        System.out.println("Maior Nota: \n Aluno: " + maiorIndice + "\n Nota: " + maior);
    }
}
