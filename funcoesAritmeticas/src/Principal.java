public class Principal {

    public static int soma(int valor1, int valor2) {
        return valor1 + valor2;
    }

    public static int subtracao(int valor1, int valor2) {
        return valor1 - valor2;
    }

    public static int multiplicacao(int valor1, int valor2) {
        return valor1 * valor2;
    }

    public static float divisao(float valor1, float valor2) {
        if(valor1 == 0 || valor2 == 0){
            return 0;
        }

        return valor1 / valor2;

        //return (valor2 == 0) ? 0 : valor1 / valor2;
    }

    public static void main(String[] args) {

    }
}
