public class Caixa<D> {
    private D dado1;
    private D dado2;

    public void imprimeDado(){
        System.out.println("O dado recebido foi: " + this.dado1);
    }

    public void setDado1(D dado1){
        this.dado1 = dado1;
    }
}
