public class ListaDpCircular {
    private No inicio;
    private No fim;
    private int quantidade;

    public ListaDpCircular() {
        this.inicio = null;
        this.fim = null;
        this.quantidade = 0;
    }
    public boolean isVazia(){
        return  inicio == null;
    }

    public void inserirNoInicio(No no){
        if(isVazia()){
            inicio = no;
            fim = no;
            no.setProximo(inicio);
            no.setAnterior(fim);
        }else {
            no.setProximo(inicio);
            inicio.setAnterior(no);
            no.setAnterior(fim);
            fim.setProximo(no);
            inicio = no;

        }
    }
    public void inserirNoFim(No no){
        if(isVazia()){
            inicio = no;
            fim = no;
            no.setProximo(inicio);
            no.setAnterior(fim);

        }else {
            fim.setProximo(no);
            no.setAnterior(fim);
            no.setProximo(inicio);
            inicio.setAnterior(no);
            fim = no;

        }

}
public void imprimir(){
        if (!isVazia()){
            No aux = inicio;
            do{
                System.out.println(aux.getNome());
                aux  = aux.getProximo();
            }while (aux!=inicio);


        }else {
            System.out.println(" a Lista esta vazia!");

        }
}
}

