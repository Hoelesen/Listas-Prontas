public class TesteListaSpCircular {
    public static void main(String[] args) {


        ListaSipCir lista = new ListaSipCir();

        System.out.printf("A lista esta Vazia" + lista.isVazia());


        lista.inserirNoInicio(new No("Maria"));
        lista.inserirNoFim(new No("Tereza"));
        lista.inserirNoInicio(new No("Amanda"));
        lista.inserirNoFim(new No("João"));

        lista.imprimir();

       //System.out.printf("A lista esta Vazia" + lista.isVazia());
    }
}
