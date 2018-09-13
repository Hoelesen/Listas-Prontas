public class Pilha {
    private Elemento topo;
    private int tamanho;

    public Pilha() {
        topo = null;
        tamanho = 0;
    }


    public boolean isVazia() {
        return topo == null;

    }

    public void empilhar(Elemento elemento) {
        elemento.setProximo(topo);
        topo = elemento;
        tamanho++;



    }

    public Elemento desempilhar() {
            if (topo==null){
                return null;
            }
            Elemento aux = topo;
            topo = topo.getProximo();
            aux.setProximo(null);

            tamanho--;


    return aux;
    }

    public int quantidade(){
        return tamanho;
    }

}



