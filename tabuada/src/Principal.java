public class Principal {

    public static void imprimeTabuada(int numero){
        for(int i = 1; i <= numero; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        imprimeTabuada(5);
    }

}
