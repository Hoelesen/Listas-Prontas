public class Elemento {
    private Elemento proximo;
    private String nome;

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Elemento(String nome) {
        this.nome = nome;
        proximo = null;
    }
}
