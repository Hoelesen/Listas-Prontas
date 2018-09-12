public class ListaSipCir {
    private No inicio;
    private int quantidade;

    public ListaSipCir() {
        inicio = null;
        quantidade = 0;

    }
    public boolean isVazia(){
        return inicio ==null;

    }
    public void inserirNoInicio(No no){
        if (isVazia()){
            inicio = no; // aponta o inicio para o No
            no.setProximo(inicio); //

        }else {
            no.setProximo(inicio);
            No aux = inicio;
            while (aux.getProximo() != inicio){
                aux.getProximo();
            }
            aux.getProximo();
        }
        return ;

    }
    public void inserirNoFim(No no){
        if (isVazia()){
            inicio = no; // aponta o inicio para o nó criado
            no.setProximo(inicio); //aponta o proximo do no criado para o inicio

        }else {
            no.setProximo(inicio);
            No aux = inicio;
            while (aux.getProximo()!=inicio){
                aux = aux.getProximo();
            }
            aux.setProximo(no);
            no.setProximo(inicio);

        }

    }
    public void imprimir(){
        if (!isVazia()){
            No aux = inicio;
            do {
                System.out.println(aux.getNome());
                aux = aux.getProximo();
            }while (aux!=inicio);

        }else {
            System.out.printf("A Lista esta Vazia");

        }
    }
}
