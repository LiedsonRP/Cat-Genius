package genius;


public class FilaMetodos {
    private No primeiro = null;
    private No ultimo = null;
    private int tamanho;
    
    public FilaMetodos(){
        this.tamanho = 0;
    }

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void adicionar(String novoValor){
        No novoElemento = new No(novoValor);
        if (this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;            
        }else{
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;            
        }
        this.tamanho++;
    }
    
    public String remover(){
        if(primeiro == null){
            this.tamanho--;
            return null;
        }else{
            String item = this.primeiro.getValor();
            if(this.primeiro == this.ultimo){
                this.primeiro = null;
                this.ultimo = null;
            }else{
                this.primeiro = this.primeiro.getProximo();
            }
            this.tamanho--;
            return item;
        }
    }
    
    public No get(int posicao){
        No atual = this.primeiro;
        for(int i=0; i < posicao; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }
    
    public String exibirFila(){
        String a = "";
        No aux = primeiro;
        while(aux!=null){
            a += aux.getValor();
            aux = aux.getProximo();
        }
        return a;
    }
}
