public class Pilha {
    private int elementos[];
    private int topo;


    /**
     * CRIAR no construtor ja me tras o tamanho da minha pilha e o inicio do topo em -1
     */
    public Pilha() {
        elementos = new int[6];
        topo = -1;

    }

    /**
     *Verifica se a Lista esta vazia;
     */
    public boolean isVazia(){
        return topo == -1;

    }

    /**
     *Verifica se a Lista esta Cheia
     */
    public boolean isCheia(){
        return topo == 5;
    }

    /**
     *
     * @param elemento empilhando elementos e incrementando o topo;
     */
    public void empilhar(int elemento){
        if (!isCheia()){
            topo++;
            elementos[topo] = elemento;
        }else {
            System.out.println("A Pilha esta Cheia");
        }
    }
    /**
     *
     * @return desempilha os elementos e decrementa o topo.
     */
    public int desempilhar() {
        int elemento = elementos[topo];
        topo--;
        return elemento;

    }
}
