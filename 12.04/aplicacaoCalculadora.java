import java.util.Scanner;

public class aplicacaoCalculadora
{
    public static void main(String[] args){
        int n1, n2;
        char op;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        n1 = scan.nextInt();
        
        System.out.println("Informe outro número: ");
        n2 = scan.nextInt();
        
        System.out.println("Informe um dos operadores: (+ - * /): ");
        op = scan.next().charAt(0);
        
        calculadora obj = new calculadora(n1, n2, op);
        
        obj.calcular();
        
        //obj.imprime();
        
        
    }
}
