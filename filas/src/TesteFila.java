public class TesteFila {
    public static void main(String[] args) {


        Fila fila = new Fila();
        System.out.println( " a fila esta vazia? "+fila.isVazia());
        System.out.println("________________________________-__");
        fila.enfileirar(new No(10));
        fila.enfileirar(new No(9));
        fila.enfileirar(new No(8));
        fila.enfileirar(new No(7));
        fila.enfileirar(new No(6));
        fila.enfileirar(new No(5));
        fila.enfileirar(new No(4));
        fila.enfileirar(new No(3));
        fila.enfileirar(new No(2));
        fila.enfileirar(new No(1));

        System.out.println( " a fila esta vazia? "+fila.isVazia());


        System.out.println(fila.desenfileirar().getConteudo());
        System.out.println(fila.desenfileirar().getConteudo());
        System.out.println(fila.desenfileirar().getConteudo());
        System.out.println(fila.desenfileirar().getConteudo());
        System.out.println(fila.desenfileirar().getConteudo());
        System.out.println(fila.desenfileirar().getConteudo());
        System.out.println(fila.desenfileirar().getConteudo());
        System.out.println(fila.desenfileirar().getConteudo());
        System.out.println(fila.desenfileirar().getConteudo());
        System.out.println(fila.desenfileirar().getConteudo());


    }
}
