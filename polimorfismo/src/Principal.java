public class Principal {
    public static void main(String[] args) {
        ProvaOlimpica provaOlimpica = new ProvaOlimpica();

        provaOlimpica.realizarProva(new Enxadrista(), new Enxadrista());
        provaOlimpica.realizarProva(new Judoca(), new Judoca());
    }
}