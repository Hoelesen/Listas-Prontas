import org.omg.CORBA.PUBLIC_MEMBER;

public class ListaD {
    private int quantidade;
    private No inicio;
    private No fim;

    public ListaD() {
        inicio = null;
        fim = null;
        quantidade = 0;

    }

    /**
     * Validando se a Lista esta Vazia
     */
    public boolean isVazia() {
        return this.inicio == null;

    }

    /**
     * inserindo no inio da Duplamente Encadeada
     */
    public void inserirNoinicio(No no) {
        if (isVazia()) {
            inicio = no; // aponta o inicio para o No
            fim = no; // aponta o fim para o no

        } else {
            no.setProximo(inicio); // apontar o proximo do no criado para o inicio
            inicio = no; // apostar o inicio para o no criado;
        }
        quantidade++;
    }

    /**
     * Inserindo no Fim da duplamente encadeada
     */
    public void inserirNoFim(No no) {
        if (isVazia()) {
            this.inicio = no; // apontar o inicio para o No criado
            this.fim = no; // apontar o fim para o no criado


        } else {
            this.fim.setProximo(no); // apontar o proximo do fim para o no
            no.setAnterior(fim); //apontar o anterior do no para o fim
            this.fim = no; //apontar o fim para o no

        }
        quantidade++;
    }

    public void imprimir() {
        if (!isVazia()) {
            No aux = this.inicio;
            while (aux != null) {
                System.out.printf(aux.getNome() + "; " + aux.getSalario());
                aux = aux.getProximo();
            }

        } else {
            System.out.printf("A lista esta Vazia!");

        }

    }
}
