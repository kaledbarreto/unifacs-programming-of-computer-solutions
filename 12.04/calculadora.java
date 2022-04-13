public class calculadora
{
    private double valor1;
    private double valor2;
    private char op;

    public calculadora(double n1, double n2, char operacao){
       this.valor1 = n1;
       this.valor2 = n2;
       this.op = operacao;
    }
    
    public double calcular(){
        switch(op){
            case '+':
                return valor1 + valor2;
            case '-':
                return valor1 - valor2;
            case '*':
                return valor1 * valor2;
            case '/':
                if(valor2 == 0){
                    System.out.println("Erro!");
                    return 404;
                }else {
                    return valor1 / valor2;
                }
            default:
                System.out.println("Erro!");
                return 404;
        }
    }
    
    public void setValor1(int n1){
        valor1 = n1;
    }
    
        public void setValor2(int n2){
        valor2 = n2;
    }
    
    public void setOp(char operacao){
        op = operacao;
    }
    
    public double getValor1(){
        return valor1;
    }
    
    public double getValor2(){
        return valor2;
    }
    
    public char getOp(){
        return op;
    }
}
