public class TesteListaDpCircular {
    public static void main(String[] args) {

        ListaDpCircular lista = new ListaDpCircular();

        System.out.println("A lista eta Vazia " + lista.isVazia());


        lista.inserirNoInicio(new No("Pedro"));
        lista.inserirNoFim(new No("Juca"));
        lista.inserirNoInicio(new No("Josiane"));
        lista.inserirNoFim(new No("Jeremias"));
        lista.imprimir();

        // Josiane Pedro Juca Jeremias

        System.out.printf("A lista eta Vazia " + lista.isVazia());

    }
}
