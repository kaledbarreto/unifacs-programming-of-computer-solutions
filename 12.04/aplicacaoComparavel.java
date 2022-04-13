import java.util.Scanner;

public class aplicacaoComparavel
{   
    public static void main(String[] args){
        int n1, n2;
        boolean verifica;
        Comparavel obj;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o número:");
        n1 = scan.nextInt();
        obj = new Comparavel(n1);
        
        System.out.println("Informe outro número:");
        n2 = scan.nextInt();
        
        verifica = obj.eMaiorOuIgual(n2);
        
        if(verifica == false){
            System.out.println(n1 + " é maior ou igual a "+n2);
        }else {
            System.out.println(n1 + " não é maior ou igual a "+n2);
        }
        
        verifica = obj.eMenorOuIgual(n2);
        
        if(verifica == false){
            System.out.println(n1 + " é menor ou igual a "+n2);
        }else {
            System.out.println(n1 + " não é menor ou igual a "+n2);
        }
        
        verifica = obj.eDiferenteDe(n2);
        
        if(verifica == false){
            System.out.println(n1 + " é diferente de "+n2);
        }else {
            System.out.println(n1 + " não é diferente de "+n2);
        }
    }
}
