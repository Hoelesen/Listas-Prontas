public class Fila {

    private No inicio;
    private  No fim;
    private int tamanho;


public Fila(){
    this.inicio = null;
    this.fim = null;
    this.tamanho = 0;
}
public boolean isVazia() {
    return inicio == null;

}

public void enfileirar(No no){
    if (isVazia()){
        inicio = no;
        fim = no;
    }else {
        fim.setAnterior(no);
        fim = no;
    }
    tamanho++;


}
    public No desenfileirar(){
        No aux = null;
        if (!isVazia()) {
            aux = inicio;
            inicio = inicio.getAnterior();
            aux.setAnterior(null);
            if (isVazia()) fim = null;
            tamanho--;

        }
        return aux;


}
}
