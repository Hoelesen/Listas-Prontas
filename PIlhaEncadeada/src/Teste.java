public class Teste {
    public static void main(String[] args) {


        Pilha pilha = new Pilha();

        System.out.println(" a pilha esta Vazia? "+pilha.isVazia());


        pilha.empilhar(new Elemento("maria"));
        pilha.empilhar(new Elemento("jose"));
        pilha.empilhar(new Elemento("Pedro"));
        pilha.empilhar(new Elemento("joana"));
        pilha.empilhar(new Elemento("paula"));
        pilha.empilhar(new Elemento("patricia"));
        System.out.println(" a pilha esta Vazia? "+pilha.isVazia());
        System.out.println(" ");
        System.out.println(pilha.quantidade());

        System.out.println("___________________________ ");
        System.out.printf(pilha.desempilhar().getNome()+ " \n");
        System.out.printf(pilha.desempilhar().getNome()+ " \n");
        System.out.printf(pilha.desempilhar().getNome()+ " \n");
        System.out.printf(pilha.desempilhar().getNome()+ " \n");
        System.out.printf(pilha.desempilhar().getNome()+ " \n");
        System.out.printf(pilha.desempilhar().getNome()+ " \n");


        System.out.println("Apilha esta Vazia? "+pilha.isVazia());

        System.out.println("___________________________ ");

    }
}
