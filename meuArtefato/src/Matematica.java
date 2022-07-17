public class Matematica {
    public static final double PI = 3.1415;

    public static double calcularHipotenusa(double cateto1, double cateto2){
        double somaQuadradoCatetos = (cateto1 * cateto1) + (cateto2 * cateto2);
        double hipotenusa = Math.sqrt(somaQuadradoCatetos);
        return hipotenusa;
    }

    public static void main(String[] args) {
        System.out.println("Hipotenusa: " + calcularHipotenusa(3.0, 4.0));
    }

}
