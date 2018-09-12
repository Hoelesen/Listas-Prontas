public class TestarListaD {
    public static void main(String[] args) {

        ListaD lista = new ListaD();
        lista.inserirNoFim(new No("Maria",1600));
        lista.inserirNoinicio(new No("Joana",1600));
        lista.inserirNoFim(new No("Marcia",1600));
        lista.inserirNoinicio(new No("juca",1600));
        lista.inserirNoFim(new No("Juraci",1600));
        lista.inserirNoinicio(new No("Maria",1600));
        lista.inserirNoFim(new No("Maria",1600));
        lista.imprimir();
    }
}
