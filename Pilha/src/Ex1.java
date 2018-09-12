public class Ex1 {

    private int elementos[];
    private int topo1;
    private int topo2;

    public Ex1() {
        elementos = new int[10];
        topo1 = -1;
        topo2 = 9;
    }

    public boolean isVazia() {
        return this.topo1 ==-1 && topo2== 10;
    }


    public boolean isCheia() {
        return this.topo1 == 9 && topo2==this.elementos.length;


    }
    public void empilhar(int empilhar1, int empilhar2){
        if (!isCheia()){

        }



    }
}
