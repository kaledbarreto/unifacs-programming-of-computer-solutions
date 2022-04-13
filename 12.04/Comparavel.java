public class Comparavel
{
    private int valor;

    //Construtor
    public Comparavel(int n){
       this.valor = n;
    }
    
    public boolean eMaiorOuIgual(int n){
        if(n>=valor){
            return true;
        }else{
            return false;
        }
    }
    
        public boolean eMenorOuIgual(int n){
        if(n<=valor){
            return true;
        }else{
            return false;
        }
    }
    
        public boolean eDiferenteDe(int n){
        if(n!=valor){
            return true;
        }else{
            return false;
        }
    }
    
    public void serValor(int n){
        valor = n;
    }
    
    public int getValor(){
        return valor;
    }
}
