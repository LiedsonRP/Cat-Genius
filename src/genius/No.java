package genius;


public class No {
    private String valor;
    private No proximo;

    public No(String valorNovo) {
        this.valor = valorNovo;
    }
    
    public void setValor(String valor){
        this.valor = valor;
    }
    
    public String getValor(){
        return valor;
    }
    
    public void setProximo(No proximo){
        this.proximo = proximo;
    }
    
    public No getProximo(){
        return proximo;
    }
}
